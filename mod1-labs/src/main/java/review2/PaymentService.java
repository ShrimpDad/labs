package review2;

public class PaymentService {

	public boolean makePayment(ShoppingBasket basket) {
	    if (validateBasket(basket)) {
	        NotificationService notify = new NotificationService();
	        notify.sendConfirmation("Paid for basket:" + basket.toString());
	        return true;
	    }
	    return false;
	}

	public boolean validateBasket(ShoppingBasket basket) {
		if (!basket.toString().isEmpty() && basket.isPriceValid()) {
			return true;
		} else {
			return false;
		}
	}

}
