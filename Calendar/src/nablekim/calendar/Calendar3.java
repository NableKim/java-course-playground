package nablekim.calendar;

import java.util.Scanner;

public class Calendar3 {
	public static void main(String[] args) {
		
		int[] monArr = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		Scanner sc = new Scanner(System.in);		
		int mon = sc.nextInt();
		System.out.println(monArr[mon-1]);

		sc.close();
	}
}
