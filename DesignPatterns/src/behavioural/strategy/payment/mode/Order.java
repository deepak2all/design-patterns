package behavioural.strategy.payment.mode;

public class Order {

	public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
    }
	
	public boolean isClosed() {
        return true;
    }
}
