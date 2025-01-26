
public class Studentarr {
    private int rollNo;
    private String name;
    private String branch;
    private int semester;
    private int marks;

    // Constructor
    public Studentarr(int rollNo, String name, String branch, int semester, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.semester = semester;
        this.marks = marks;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public int getSemester() {
        return semester;
    }

    public int getMarks() {
        return marks;
    }

    // ToString method for easy display
    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Branch: " + branch +
                ", Semester: " + semester + ", Marks: " + marks;
    }
}