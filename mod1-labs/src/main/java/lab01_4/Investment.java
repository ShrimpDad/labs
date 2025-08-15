package lab01_4;

public class Investment {
	public static void main(String[] args) {
		int balance = 100;
		int startingInv = balance;

		int expectedReturn = 200;
		int years = 0;

		while (balance < expectedReturn) {
			balance *= 1.05;
			years++;
		}
		System.out.println(
				"It takes " + years + " years for interest on £" + startingInv + " to compound to £" + expectedReturn);

	}
}
