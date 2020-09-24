package behavioural.strategy.route.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByPayPal implements PayStrategy {

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    
	@Override
	public boolean pay(int paymentAmount) {
		// TODO Auto-generated method stub
		System.out.println("Paying " + paymentAmount + " using PayPal.");
		System.out.println("Payment Successful");
        return true;
	}

	@Override
	public void collectPaymentDetails(RouteStrategy routeStrategy) {
		// TODO Auto-generated method stub
		int total = routeStrategy.totalCost();
		try {
                System.out.print("Enter the user's email: ");
                email = READER.readLine();
                System.out.print("Enter the password: ");
                password = READER.readLine();
                System.out.println("Data verification has been successful.");
                pay(total);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}

}
