import java.util.ArrayList;

public class Group {

  int number;
  Teacher teacher;
  CourseInstance cource_instance;
  ArrayList<EnrolledStudent> arrayofenrolledstudent;
  ArrayList<TimeTable> arrayofTimeTable;

  public Group(){
    arrayofenrolledstudent = new ArrayList<EnrolledStudent>();
    arrayofTimeTable = new ArrayList<TimeTable>();
  }

  public Group(int number, Teacher teacher, CourseInstance cource_instance) {
    this.number = number;
    this.teacher = teacher;
    this.cource_instance = cource_instance;
    arrayofenrolledstudent = new ArrayList<EnrolledStudent>();
    arrayofTimeTable = new ArrayList<TimeTable>();
  }

  public void enrolledStudent(Student s) {
    if (!s.isenrolled()) {
      s.enrolled();
      EnrolledStudent enrolledStudent = new EnrolledStudent(s);
      arrayofenrolledstudent.add(enrolledStudent);
    }else {
      System.out.println("This Student is alreadt enrolled");
    }
  }
  public void printEnrolledStudents() {
    System.out.println("Enrolled Students:");
    for (EnrolledStudent enrolledStudent : arrayofenrolledstudent) {
        Student student = enrolledStudent.getEnrolledStudent(); // Assuming you have a getStudent() method in EnrolledStudent
        System.out.println("- Name: " + student.getName());
        System.out.println("  ID: " + student.getID());
        // Print other student information as needed
    }
}

  
}
