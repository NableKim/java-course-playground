import java.util.Scanner;

public class firstSource {
	public static void main(String[] args) {
		for(int number =2; number<=9; number++) {
			// 배열 생성
			int[] result = new int[10];
			
			// 구구단 계산값을 배열에 저장
			for(int j=1; j<=9; j++)
				result[j] = number * j;
			
			// 구구단 결과 출력
			System.out.println("==== "+number+"단 ====");
			for(int j=1; j<=9; j++)
				System.out.println(number+ " X " + j + " = " + result[j]);
		}
	}
}
