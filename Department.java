
public class Department {

  private int id;
  private String Name;

  public Department(int id, String Name) {
    this.id = id;
    this.Name = Name;
  }

  public String toString() {
    return String.format(" Name of Department : %s " + Name, " ID :  %s " + id);
  }
}
