import java.util.Scanner;

public class firstSource {
	public static void main(String[] args) {
		
		System.out.println("몇 단을 출력할까요? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		// 2~9 범위의 숫자를 올바르게 입력받았는가
		if(number>=2 && number<=9) {
			System.out.println("==== "+number+"단 ====");
			for(int j=1; j<=9; j++)
				System.out.println(number+" X "+j+" = " + number*j);
		} else {
			System.out.println("2~9 범위의 숫자를 입력해주세요!!!");
		}
		
	}
}
