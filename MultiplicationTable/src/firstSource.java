import java.util.Scanner;

public class firstSource {
	
	public static int[] calculate(int number) {
		int[] result = new int[10];
		for(int i=1; i<=9; i++)
			result[i] = i * number;
		return result;
	}
	
	public static void print(int number, int[] result) {
		System.out.println("==== "+number+"단 ====");
		for(int i=1; i<=9; i++)
			System.out.println(number+ " X " + i + " = " + result[i]);
	}
	
	public static void main(String[] args) {
		for(int number =2; number<=9; number++) {
			int[] result = calculate(number);
			print(number, result);
		}
	}
}
