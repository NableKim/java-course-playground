package nablekim.calendar;

import java.util.Scanner;

public class Prompt {
	private static final String PROMPT_YEAR = "year> ";
	private static final String PROMPT_MONTH = "month> ";
	private static final String PROMPT_WEEKDAY = "weekday> ";
	
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		while(true) {
			System.out.println("종료하시려면 -1을 입력하세요.");
			System.out.print(PROMPT_YEAR);
			int year = sc.nextInt();
			
			if(year == -1) break;
			
			System.out.println("월 숫자(1~12)을 입력하세요.");
			System.out.print(PROMPT_MONTH);
			int month = sc.nextInt();
			if(month<1 || month>12) continue;
			
			System.out.println("요일(SU, MO, TU, ... SA)을 입력하세요.");
			System.out.print(PROMPT_WEEKDAY);
			String weekday = sc.next();
			
			cal.printMonth(year, month, weekday);
		}

		sc.close();
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
