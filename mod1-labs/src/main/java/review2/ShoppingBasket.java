package review2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingBasket {

	private ArrayList<Product> basketProducts = new ArrayList<>();
	private LocalDateTime savedTime = LocalDateTime.now();// = new LocalDateTime();

	public boolean addItem(Product product, int quantity) {
		if (product == null || quantity <= 0) {
	        return false;
	    }
	    for (int i = 0; i < quantity; i++) {
	        basketProducts.add(product);
	    }
	    return true;
	}

	public boolean removeItem(Product product) {
		return basketProducts.remove(product);
	}
	
	public ArrayList<Product> getBasket(){
		return basketProducts;
	}

	public void clearBasket() {
		basketProducts.clear();
	}

	public void saveBasket() {
		savedTime = LocalDateTime.now();
	}

	public boolean isPriceValid() {
		if ((Duration.between(savedTime, LocalDateTime.now())).toDays() < 1) {
			return true;
		} else {
			return false;
		}
	}

	public int getQuantity(int productID) {
		int quantity = 0;
		for (Product product : basketProducts) {
			if (product.getID() == productID) {
				quantity += 1;
			}
		}
		return quantity;
	}

	public HashMap<Integer, Product> getUniqueProducts() {
		HashMap<Integer, Product> uniqueProducts = new HashMap<>();
		for (Product basketProduct : basketProducts) {
			if (!uniqueProducts.containsKey(basketProduct.getID())) {
				uniqueProducts.put(basketProduct.getID(), basketProduct);
			}
		}
		return uniqueProducts;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (Product product : getUniqueProducts().values()) {
			stringBuilder.append("\rProduct: ");
			stringBuilder.append(product.getName());
			stringBuilder.append(" (ID:");
			stringBuilder.append(product.getID());
			stringBuilder.append(") *");
			stringBuilder.append(getQuantity(product.getID()));
			stringBuilder.append(" = £");
			stringBuilder.append(getQuantity(product.getID()) * product.getPrice());
		}
		return stringBuilder.toString();
	}

}
