import   java.sql.*;
class  Getvalue {
    static public void main(String args[]) throws Exception {
      Class.forName("org.postgresql.Driver");
      Connection  con =  DriverManager.getConnection( "jdbc:postgresql://localhost:5432/gec", "postgres", "postgres");  // for postgresql
      Statement  st =  con.createStatement();
      ResultSet   rs=  st.executeQuery("select * from employee order by empid");
      while(rs.next()){
	    int  eid=  rs.getInt("empid");
	    String  na=  rs.getString("empname");
	    Date  db = rs.getDate("dob");
	    int  did=  rs.getInt("deptid");
	     float  sal = rs.getFloat("salary"); 
             System.out.println(eid +"\t"+ na +"\t"+ db +"\t"+ did +"\t"+ sal);
      }
      con.close();  
}};

/*Compile  as:      javac Getvalue.java
Now copy postgresql-42.7.3.jar file into same location where  Getvalue.stored.

Run as   :       java  -cp   postgresql-42.7.3.jar;.   Getvalue

*/