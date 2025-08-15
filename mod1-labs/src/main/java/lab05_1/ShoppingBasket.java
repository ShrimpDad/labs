package lab05_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ShoppingBasket {

	static int basketNum = 0;

	ShoppingBasket() {
		addRandomItems(5);
	}

	private ArrayList<ShoppingBasketItem> basketItems = new ArrayList<>();
	private ArrayList<String> items = new ArrayList<>(Arrays.asList("Milk", "Eggs", "Bread", "Butter", "Cheese",
			"Tomatoes", "Apples", "Bananas", "Cereal", "Chicken", "Beef", "Pasta", "Rice", "Toilet Paper", "Shampoo",
			"Soap", "Coffee", "Tea", "Juice", "Yogurt"));

	void getDetails() {
		double value = 0;
		basketNum += 1;
		System.out.println("Basket " + basketNum + ":");
		for (ShoppingBasketItem item : basketItems) {
			value += item.getPrice() * item.getQuantity();
			System.out.println(item.getDetails());
		}
		System.out.printf("---------------------------%nTotal value = £%g%n=-=-=-=-=-=-=-=-=-=-=-=-=-=%n", value);
	}

	void add(ShoppingBasketItem item) {
		this.basketItems.add(item);
	}

	void addRandomItem() {

		Random rand = new Random();

		ShoppingBasketItem item = new ShoppingBasketItem(items.get(rand.nextInt(items.size())), rand.nextInt(1, 10),
				rand.nextInt(1, 5));
		add(item);
	}

	void addRandomItems(int numberOfItems) {
		for (int i = 0; i < numberOfItems; i++) {
			addRandomItem();
		}
	}
}
