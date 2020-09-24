package behavioural.strategy.payment.mode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;
    
	public static void main (String[] args){
		try {
			if(order.isClosed()){
				System.out.println("Total amount to be paid is Rs.732");
				System.out.println("Please, select a payment method:" + "\n" +
		                "1 - PalPay" + "\n" +
		                "2 - Credit Card");
		        String paymentMethod = reader.readLine();
		
		        // Client creates different strategies based on input from user,
		        // application configuration, etc.
		        if (paymentMethod.equals("1")) {
		            strategy = new PayByPayPal();
		        } else {
		            strategy = new PayByCreditCard();
		        }
		
		        // Order object delegates gathering payment data to strategy
		        // object, since only strategies know what data they need to
		        // process a payment.
		        order.processOrder(strategy);
			}
		} catch (IOException e ){
			
		}
	}
	
}
