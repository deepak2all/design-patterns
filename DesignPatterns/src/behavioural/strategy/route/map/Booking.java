package behavioural.strategy.route.map;


public class Booking {

	public void processBooking(PayStrategy strategy, RouteStrategy routeStrategy) {
        strategy.collectPaymentDetails(routeStrategy);
    }
	
	public int isClosed(RouteStrategy routeStrategy) {
		System.out.println("You have reached your destination");
        return routeStrategy.totalCost();
    }
}
