public class firstSource {
	public static void main(String[] args) {
		for(int number =2; number<=9; number++) {
			int[] result = MultiplicationTable.calculate(number);
			MultiplicationTable.print(number, result);
		}
	}
}
