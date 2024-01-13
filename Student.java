import java.time.LocalDate;

public class Student extends Person {

  private int studentId;
  private Constants.Semester firstSemester;
  private int firstYear;
  private Constants.StudentType type;
  private Department dept;
  private boolean enrolled;

  public Student(
    String nid,// national id number 
    String name, // the short midget 
    LocalDate date, //the date the student enrolled 
    int studentId,// student id 
    Constants.Semester firstSemester, // Spring , Winter... basically starting semester
    int firstYear, // the yea he entered 
    Constants.StudentType type // the type f the student 
  ) {
    super(nid, name, date);
    this.studentId = studentId;
    this.firstSemester = firstSemester;
    this.firstYear = firstYear;
    this.type = type;
    this.enrolled = false;
  }

  public String toString() {
    return (
      String.format(" Student ID : %s " + studentId, "\n") +
      super.toString() +
      String.format(
        " \n Type : %s " + type,
        " Year Entered : %s " + firstYear,
        " Semester : %s " + firstSemester,
        " Department : %s " + dept
      )
    );
  }

  // getters and setters 
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }

  public void setID(int id){
    this.studentId = id;
  }
  public int getID(){
    return this.studentId;
  }

  public void setDept(Department dept) {
    this.dept = dept;
  }

  public Department getDept() {
    return dept;
  }

  public boolean isenrolled() {
    return enrolled;
  }

  public void enrolled() {
    enrolled = true;
  }

  public void unenrolled() {
    enrolled = false;
  }
}
