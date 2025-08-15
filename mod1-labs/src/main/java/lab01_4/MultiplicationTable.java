package lab01_4;

public class MultiplicationTable {

	public static void main(String[] args) {

		multiplicationTable();

	}

	public static void multiplicationTable() {

		Integer[] xArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Integer[] yArray = xArray.clone();

		for (int xPos : xArray) {

			for (int yPos : yArray) {
				System.out.printf("%5d", (xPos * yPos));
			}

			System.out.printf("\n");

		}

	}

}
