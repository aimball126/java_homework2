
import java.time.LocalDate;

public class Teacher extends Person {

  private int teacherld;
  private Constants.Degree degree;
  private Constants.Rank rank;
  private Department dept;

  public Teacher(
    String nid,
    String name,
    LocalDate date,
    int teacherld,
    Constants.Degree degree,
    Constants.Rank rank
  ) {
    super(nid, name, date);
    this.teacherld = teacherld;
    this.degree = degree;
    this.rank = rank;
  }

  public String toString() {
    return (
      String.format(" Teacher ID : %s " + teacherld, "\n") +
      super.toString() +
      String.format(
        " Degree : %s " + degree,
        " Rank : %s " + rank,
        " Department : %s " + dept
      )
    );
  }

  public void setDept(Department dept) {
    this.dept = dept;
  }

  public Department getDept() {
    return dept;
  }
}
