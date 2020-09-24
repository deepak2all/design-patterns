package structural.decorator.computer.inheritance;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicComputerWithUPS c = new BasicComputerWithUPS();
		c.listFeatures();
		System.out.println("Price :: " + c.getPrice());
		
		BasicComputerWithUPSAndSpeakers cus = new BasicComputerWithUPSAndSpeakers();
		cus.listFeatures();
		System.out.println("Price :: " + cus.getPrice());
		
		/**
		 * So if we want to offer customers add ons or accessories
		 * on top of the basic product
		 * we need to make a new class for every new combination(s)
		 * This results in CLASS EXPLOSION, which is a major problem with
		 * using INHERITANCE
		 * The next problem with inheritance is that the 
		 * extensions are defined at COMPILE TIME itself and hence it's a
		 * RIGID BINDING
		 * DECORATOR DESIGN PATTERN enables to add new functionalities DYNAMICALLY
		 * at RUNTIME. It uses COMPOSITION instead of INHERITANCE
		 */
	}

}
