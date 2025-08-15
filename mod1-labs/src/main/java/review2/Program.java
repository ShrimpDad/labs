package review2;

public class Program {

	public static void main(String[] args) {

		ShoppingBasket basket = new ShoppingBasket();
		Product beans = new Product(1,"Beans",1.00);
		basket.addItem(beans, 3);
		Product egg = new Product(2,"Egg",2.00);
		basket.addItem(egg, 2);
		
		//System.out.println( basket.toString());
		
		PaymentService pay = new PaymentService();
		pay.makePayment(basket);
		
	}

}
