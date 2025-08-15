package lab01_3;

import java.util.Scanner;

public class LunchHall {

	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		String mainDish = getMainDish();
		int roastPotatoCount = getRoastPotatoCount();
		int brusselSproutCount = getBrusselSproutCount();
		displayMealSummary(mainDish, roastPotatoCount, brusselSproutCount);

		s.close();
	}

	public static String getMainDish() {
		String selection = "None";
		int input = 0;

		System.out.printf("Please choose main meal: %n1. Chicken%n2. Fish%n3. Vegitarian%nYour selection: ");
		input = s.nextInt();

		if (input == 1) {
			selection = "Chicken";
		} else if (input == 2) {
			selection = "Fish";
		} else if (input == 3) {
			selection = "Vegitarian";
		}

		return selection;
	}

	public static int getRoastPotatoCount() {
		int input = 0;

		System.out.printf("Please enter how many Roast Potatoes you would like: ");
		input = s.nextInt();

		return input;
	}

	public static int getBrusselSproutCount() {
		int input = 0;

		System.out.printf("Please enter how many Brussel Sprouts you would like: ");
		input = s.nextInt();

		return input;
	}

	public static void displayMealSummary(String mainDish, int roastPotatoCount, int brusselSproutCount) {
		System.out.printf("Meal Summary:%nMain: %s%nRoast Potatoes: %d%nBrussel Sprouts: %d%n", mainDish,
				roastPotatoCount, brusselSproutCount);
	}

}
