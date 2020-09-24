package behavioural.strategy.route.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {

	private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
	
	@Override
	public boolean pay(int paymentAmount) {
		// TODO Auto-generated method stub
		System.out.println("Paying " + paymentAmount + " using Credit Card.");
		System.out.println("Payment Successful");
		return true;
	}

	@Override
	public void collectPaymentDetails(RouteStrategy routeStrategy) {
		// TODO Auto-generated method stub	
		int total = routeStrategy.totalCost();
        try {
        	System.out.print("Enter the card number: ");
			String number = READER.readLine();
			System.out.print("Enter the card expiration date 'mm/yy': ");
	        String date = READER.readLine();
	        System.out.print("Enter the CVV code: ");
	        String cvv = READER.readLine();
	        System.out.println("Card details received ..");
	        System.out.println("Card validated ..");
	        System.out.println("Initiating the payment");
	        pay(total);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
