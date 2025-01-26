
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

    // Method to read students from a file
    public static List<Student> readStudentsFromFile(String fileName) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    int rollNo = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    String branch = parts[2].trim();
                    int semester = Integer.parseInt(parts[3].trim());
                    int marks = Integer.parseInt(parts[4].trim());

                    students.add(new Student(rollNo, name, branch, semester, marks));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    // Method to find student by serial number
    public static Student getStudentBySerialNumber(List<Student> students, int serialNumber) {
        if (serialNumber >= 0 && serialNumber < students.size()) {
            return students.get(serialNumber);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        // Path to the file containing student data
        String fileName = "students.txt";

        // Read students from file
        List<Student> students = readStudentsFromFile(fileName);

        // Display the students
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter serial number to fetch student details: ");
        int serialNumber = scanner.nextInt();

        Student student = getStudentBySerialNumber(students, serialNumber);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("No student found with serial number " + serialNumber);
        }

        scanner.close();
    }
}