package structural.decorator.computer.inheritance;

public class BasicComputerWithUPS extends BasicComputer {
	public BasicComputerWithUPS(){
		super();
	}
	
	@Override
	public void listFeatures() {
		// TODO Auto-generated method stub
		super.listFeatures();
		System.out.println("Adding.. Uninterrupted Power Supply");
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()+40.0;
	}
}
