package structural.decorator.computer.inheritance;

public class BasicComputer extends Computer{

	@Override
	public void listFeatures() {
		// TODO Auto-generated method stub
		System.out.println("keyboard");
		System.out.println("Mouse");
		System.out.println("Monitor");
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 100.0;
	}

}
