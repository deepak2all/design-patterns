package behavioural.strategy.route.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Booking bookingOrder = new Booking();
    private static PayStrategy payStrategy;
    private static RouteStrategy routeStrategy;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Please, select a the desired route:" + "\n" +
	                "1 - Least Cost" + "\n" +
	                "2 - Least Distance" + "\n" +
	                "3 - Least Time" );
			String routeChoice = reader.readLine();
			switch(routeChoice){
				case "1" :
					routeStrategy = new LeastCostRoute();
					choosePayment(routeStrategy);
					break;
				case "2" :
					routeStrategy = new LeastDistanceRoute();
					choosePayment(routeStrategy);
					break;
				case "3" :
					routeStrategy = new LeastTimeRoute();
					choosePayment(routeStrategy);
					break;	
				default : 
					System.out.println("Incorrect choice specified");
					break;
			}			
		} catch (IOException e ){
			
		}
	}
	
	public static void choosePayment(RouteStrategy routeStrategy){
		try {
			int totalCost = bookingOrder.isClosed(routeStrategy);
			if(totalCost>0){
				System.out.println("Total amount to be paid is Rs."+totalCost);
				System.out.println("Please, select a payment method:" + "\n" +
		                "1 - PalPay" + "\n" +
		                "2 - Credit Card");
		        String paymentMethod = reader.readLine();
		
		        // Client creates different strategies based on input from user,
		        // application configuration, etc.
		        if (paymentMethod.equals("1")) {
		        	payStrategy = new PayByPayPal();
		        } else {
		        	payStrategy = new PayByCreditCard();
		        }
		
		        // Order object delegates gathering payment data to strategy
		        // object, since only strategies know what data they need to
		        // process a payment.
		        bookingOrder.processBooking(payStrategy, routeStrategy);
			}
		} catch (IOException e ){
			
		}
	}

}
