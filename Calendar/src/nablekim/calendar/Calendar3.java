package nablekim.calendar;

import java.util.Scanner;

public class Calendar3 {
	
	public static final int[] monArr = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getDaysOfMonth(int month) {
		return monArr[month-1];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int mon = sc.nextInt();
		
		Calendar3 cal = new Calendar3();
		System.out.println(cal.getDaysOfMonth(mon));

		sc.close();
	}
}
