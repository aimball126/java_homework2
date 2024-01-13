import java.util.ArrayList;

public class Group {

  int number;
  Teacher teacher;
  CourseInstance cource_instance;
  ArrayList<EnrolledStudent> arrayofenrolledstudent;
  ArrayList<TimeTable> arrayofTimeTable;

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
    }
  }
}
