package behavioural.strategy.route.map;

public interface PayStrategy {

	boolean pay(int paymentAmount);
    void collectPaymentDetails(RouteStrategy routeStrategy);
    
}
