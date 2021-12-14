package nablekim.calendar;

import java.util.Scanner;

public class Prompt {
	private static final String PROMPT_YEAR = "year> ";
	private static final String PROMPT_MONTH = "month> ";
	private static final String PROMPT_MENU = "menu> ";
	
	public void printMenu() {
		System.out.println("+-----------------------");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말");
		System.out.println("| q. 종료");
		System.out.println("+-----------------------");
		System.out.println(PROMPT_MENU);
	}
	
	public void runPrompt() {
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		while(true) {
			printMenu();	// 메뉴 출력
			String cmd = sc.next();
			if(cmd.equals("1")) cmdRegister();
			else if(cmd.equals("2")) cmdSearch();
			else if(cmd.equals("3")) cmdCal(sc, cal);
			else if(cmd.equals("h")) printMenu();
			else if(cmd.equals("q")) break;
		}

		sc.close();
	}
	
	private void cmdCal(Scanner sc, Calendar cal) {
		System.out.println("년도(xxxx)를 입력하세요.");
		System.out.print(PROMPT_YEAR);
		int year = sc.nextInt();

		System.out.println("월 숫자(1~12)을 입력하세요.");
		System.out.print(PROMPT_MONTH);
		int month = sc.nextInt();
		if(month<1 || month>12) return;
		
		cal.printMonth(year, month);
	}

	private void cmdSearch() {
		// TODO Auto-generated method stub
		
	}

	private void cmdRegister() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
