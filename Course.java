public class Course {

  String code;
  String name;
  int credits;
  int hoursTheory;
  int hoursPractice;
  Department dept;

  public Course(
    String code,
    String name,
    int credits,
    int hoursTheory,
    int hoursPractice,
    Department dept
  ) {
    this.code = code;
    this.name = name;
    this.credits = credits;
    this.hoursTheory = hoursTheory;
    this.hoursPractice = hoursPractice;
    this.dept = dept;
  }

  public String toString() {
    return (
      String.format(
        " DEPARTMENT IS : " + dept,
        " CODE IS : " + code,
        " NAME IS : " + name,
        " CREDITS IS : " + credits,
        " HOURSTHEORY IS : " + hoursTheory,
        " HOURSPRACTICE IS : " + hoursPractice,
        " \n"
      )
    );
  }
}
