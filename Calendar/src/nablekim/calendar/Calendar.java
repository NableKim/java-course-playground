package nablekim.calendar;

public class Calendar {
	public static final int[] monthArr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getDaysOfMonth(int month) {
		return monthArr[month - 1];
	}
	
	public void printMonth(int month) {
		int dayOfMonth = getDaysOfMonth(month);
		
		System.out.printf("< %d월 >\n", month);
		System.out.println("  일 월 화 수 목 금 토");
		System.out.println("====================");
		
		for(int i=0; i<dayOfMonth; i++) {
			System.out.printf("%3d", i+1);
			if(i%7==6) System.out.print("\n");
		}
		System.out.print("\n");
	}
}
