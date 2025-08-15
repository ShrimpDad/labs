package lab01_4;

public class Program {
	public static void main(String[] args) {

		int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };

		printSum(numbers);
		printAverage(numbers);
		printMinimum(numbers);
		printMaximum(numbers);
		indexOfZero(numbers);

	}

	private static void printSum(int[] numbers) {

		int sum = 0;

		for (int number : numbers) {
			sum += number;
		}

		System.out.println(sum);

	}

	private static void printAverage(int[] numbers) {

		int sum = 0;

		for (int number : numbers) {
			sum += number;
		}

		System.out.println(sum / numbers.length);

	}

	private static void printMinimum(int[] numbers) {

		int minimum = Integer.MAX_VALUE;

		for (int number : numbers) {
			if (number < minimum) {
				minimum = number;
			}
		}

		System.out.println(minimum);

	}

	private static void printMaximum(int[] numbers) {

		int maximum = Integer.MIN_VALUE;

		for (int number : numbers) {
			if (number > maximum) {
				maximum = number;
			}
		}

		System.out.println(maximum);

	}

	private static void indexOfZero(int[] numbers) {

		int index = 0;

		for (int number : numbers) {
			if (number == 0) {
				break;
			}
			index++;
		}

		System.out.println(index);

	}
}
