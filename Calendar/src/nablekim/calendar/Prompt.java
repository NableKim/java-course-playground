package nablekim.calendar;

import java.util.Scanner;

public class Prompt {
	private static final String PROMPT_YEAR = "year> ";
	private static final String PROMPT_MONTH = "month> ";
	
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		while(true) {
			System.out.print(PROMPT_YEAR);
			int year = sc.nextInt();
			
			System.out.print(PROMPT_MONTH);
			int month = sc.nextInt();
			
			if(month == -1) break;
			if(month<1 || month>12) continue;
			cal.printMonth(year, month);
		}

		sc.close();
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
