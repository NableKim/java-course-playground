package nablekim.calendar;

import java.util.Scanner;

public class Prompt {
	private static final String PROMPT = "cal> ";
	
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		while(true) {
			System.out.print(PROMPT);
			int month = sc.nextInt();
			if(month == -1) break;
			if(month<1 || month>12) continue;
			cal.printMonth(month);
		}

		sc.close();
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
