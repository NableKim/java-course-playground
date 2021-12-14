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
	
	public int getWeekDay(String weekdayStr) {
		if(weekdayStr.equals("SU")) return 0;
		else if(weekdayStr.equals("MO")) return 1;
		else if(weekdayStr.equals("TU")) return 2;
		else if(weekdayStr.equals("WE")) return 3;
		else if(weekdayStr.equals("TH")) return 4;
		else if(weekdayStr.equals("FR")) return 5;
		else if(weekdayStr.equals("SA")) return 6;
		return 0;
	}
	
	public int getTotalDaysFrom1970(int year, int month) {
		int syear = 1970;
		int smonth = 1;
		
		//1970.1.1 기준 몇일째인지 계산
		int count = 0;
		for(int i=syear; i<year; i++) {
			if(isLeapYear(i))
				count += 366;
			else
				count += 365;
		}
		
		for(int i=smonth; i<month; i++) {
			count += getDaysOfMonth(year, i);
		}
		
		return count;
	}
	
	public void printMonth(int year, int month) {
		int dayOfMonth = getDaysOfMonth(year, month);
		int count = getTotalDaysFrom1970(year, month);
		int weekday = (count+4)%7;
		
		System.out.printf("< %d년 %d월 >\n", year, month);
		System.out.println("  일 월 화 수 목 금 토");
		System.out.println("====================");
		
		for(int i=0; i<weekday; i++) {
			System.out.printf("   ");
		}
		
		for(int i=0; i<dayOfMonth; i++) {
			System.out.printf("%3d", i+1);
			if((i+weekday)%7==6) System.out.print("\n");
		}
		System.out.print("\n\n");
	}
}
