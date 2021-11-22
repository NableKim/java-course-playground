import java.util.Scanner;

public class firstSource {
	public static void main(String[] args) {
		
		System.out.println("몇 단을 출력할까요? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		// for문
		System.out.println("==== "+number+"단 ====");
		for(int j=1; j<=9; j++)
			System.out.println(number+" X "+j+" = " + number*j);
	
		// 줄 나눔
		System.out.print("\n\n");
		
		// while문
		System.out.println("==== "+number+"단 ====");
		int i=1;
		while(i<10) {
			System.out.println(number+" X "+i+" = " + number*i);
			i++;
		}
		
	}
}
