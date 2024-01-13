public class Constants {

  public enum Semester {
    Fall,
    Spring,
    Summer,
  }

  public enum StudentType {
    UnderGrade,
    Master,
    phD,
  }

  public enum Degree {
    Master,
    phD,
  }

  public static enum Rank {
    Assistant_Lecturer,
    Lecturer,
    Assistant_Professor,
    Associate_Professor,
    Professor,
  }

  public enum DayOfWeek {
    SAT,
    SUN,
    MON,
    TUE,
    WED,
    THU,
  }

  public enum TimeSlot {
    MORNING("9:00 AM", "11:00 AM"),
    AFTERNOON("12:00 PM", "2:00 PM");

    private final String startTime;
    private final String endTime;

    TimeSlot(String startTime, String endTime) {
      this.startTime = startTime;
      this.endTime = endTime;
    }

    public String getStartTime() {
      return startTime;
    }

    public String getEndTime() {
      return endTime;
    }

    public String getTimeRange() {
      return startTime + " - " + endTime;
    }
  }
}
