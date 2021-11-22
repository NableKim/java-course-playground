import java.util.Scanner;

public class firstSource {
	public static void main(String[] args) {
		
		System.out.println("몇 단을 출력할까요? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println("==== "+number+"단 ====");
		for(int j=1; j<=9; j++)
			System.out.println(number+" X "+j+" = " + number*j);
		
	}
}
