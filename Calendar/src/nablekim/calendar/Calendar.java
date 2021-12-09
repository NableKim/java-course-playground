package nablekim.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		
		// 두 수를 입력받기
		Scanner sc = new Scanner(System.in);
		
		String s1, s2;
		s1 = sc.next();
		s2 = sc.next();
		
		// 정수형 변수에 저장
		int a, b;
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		// 정답 출력
		System.out.printf("두 수의 합은 %d 입니다", a+b);
		
		// 자원 해제
		sc.close();
	}
}
