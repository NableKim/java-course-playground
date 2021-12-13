package nablekim.calendar;

import java.util.Scanner;

public class Calendar4 {

	
	public static final int[] monthArr = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getDaysOfMonth(int month) {
		return monthArr[month-1];
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inputCnt = sc.nextInt();
		
		Calendar4 cal = new Calendar4();
		
		for(int i=0; i<inputCnt; i++) {
			int month = sc.nextInt();
			System.out.println(cal.getDaysOfMonth(month));
		}
		
		sc.close();
	}
}
