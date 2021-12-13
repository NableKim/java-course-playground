package nablekim.calendar;

public class Calendar {
	public static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		return false;
	}
	
	public int getDaysOfMonth(int year, int month) {
		if(isLeapYear(year))
			return LEAP_MAX_DAYS[month - 1];
		return MAX_DAYS[month - 1];
	}
	
	public void printMonth(int year, int month) {
		int dayOfMonth = getDaysOfMonth(year, month);
		
		System.out.printf("< %d년 %d월 >\n", year, month);
		System.out.println("  일 월 화 수 목 금 토");
		System.out.println("====================");
		
		for(int i=0; i<dayOfMonth; i++) {
			System.out.printf("%3d", i+1);
			if(i%7==6) System.out.print("\n");
		}
		System.out.print("\n");
	}
}
