package nablekim.calendar;

import java.util.Scanner;

public class Calendar5 {

	public static final int[] monthArr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getDaysOfMonth(int month) {
		return monthArr[month - 1];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calendar5 cal = new Calendar5();
		String PROMPT = "cal>";

		while(true) {
			System.out.print(PROMPT);
			int month = sc.nextInt();
			if(month == -1) break;
			if(month<1 || month>12) continue;
			System.out.println(cal.getDaysOfMonth(month));
		}

		sc.close();
	}
}
