package nablekim.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		
		// �� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		String s1, s2;
		s1 = sc.next();
		s2 = sc.next();
		
		// ������ ������ ����
		int a, b;
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		// ���� ���
		System.out.printf("�� ���� ���� %d �Դϴ�", a+b);
		
		// �ڿ� ����
		sc.close();
	}
}
