package lab05_1;

public class ShoppingBasketItem {

	String productName;
	int quantity;
	double price;

	public ShoppingBasketItem(String name, int quantity, double price) {
		this.productName = name;
		this.quantity = quantity;
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

	public String getDetails() {
		return "Item: " + this.productName + ", Item Price: £" + this.price + ", Qty: " + this.quantity;
	}

	public double getQuantity() {
		return this.quantity;
	}
}
