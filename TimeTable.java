
public class TimeTable {

  Constants.DayOfWeek day_of_week;
  Constants.TimeSlot time_Slot;
  String location;

  public TimeTable(
    Constants.DayOfWeek day_of_week,
    Constants.TimeSlot time_Slot,
    String location
  ) {
    this.day_of_week = day_of_week;
    this.time_Slot = time_Slot;
    this.location = location;
  }
}
