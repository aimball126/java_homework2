public class EnrolledStudent {

  private float midTermGreade;
  private float finalGrade;
  private Student stud;

  public EnrolledStudent(float midTermGreade, float finalGradeStudent) {
    this.midTermGreade = midTermGreade;
    this.finalGrade = finalGrade;
  }

  public EnrolledStudent(Student stud) {
    this.stud = stud;
  }
}
