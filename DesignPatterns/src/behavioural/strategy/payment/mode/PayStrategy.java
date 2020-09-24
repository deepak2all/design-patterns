package behavioural.strategy.payment.mode;

public interface PayStrategy {

	boolean pay(int paymentAmount);
    void collectPaymentDetails();
    
}
