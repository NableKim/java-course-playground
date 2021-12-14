package nablekim.calendar;

public interface ManageSchedule {
	public void loadSchduleData(Calendar cal);
	public void storeScheduleData(String dateStr, String scheduleStr);
}
