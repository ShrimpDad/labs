package lab05_1;

import java.util.ArrayList;

public class Program {

	static ArrayList<ShoppingBasket> shoppingBaskets = new ArrayList<>();

	public static void main(String[] args) {
		setupBaskets(10);
		processBaskets();

	}

	public static void processBaskets() {
		for (ShoppingBasket basket : shoppingBaskets) {
			basket.getDetails();
		}
	}

	public static void setupBaskets(int numOfBaskets) {

		for (int i = 0; i < numOfBaskets; i++) {
			ShoppingBasket shoppingBasket = new ShoppingBasket();
			shoppingBaskets.add(shoppingBasket);
		}
	}
}
