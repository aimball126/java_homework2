import java.time.LocalDate;

public class Main {
public static void main(String[] args) {
    // Example values for constructor arguments
    String nid = "123456789";
    String name = "John Doe";
    LocalDate date = LocalDate.of(2024, 1, 1);
    int studentId = 1001;
    Constants.Semester firstSemester = Constants.Semester.Spring;
    int firstYear = 2024;
    Constants.StudentType type = Constants.StudentType.FULL_TIME;

    // Call the Student constructor to create a new Student object
    Student student = new Student(nid, name, date, studentId, firstSemester, firstYear, type);

    // You can now use the student object to access its properties and methods
    System.out.println("Student name: " + student.getName());
    System.out.println("Student ID: " + student.getID());
    // ... other operations with the student object
}

}
