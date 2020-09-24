package structural.decorator.computer.inheritance;

public class BasicComputerWithUPSAndSpeakers extends BasicComputerWithUPS {

	public BasicComputerWithUPSAndSpeakers(){
		super();
	}
	
	@Override
	public void listFeatures() {
		// TODO Auto-generated method stub
		System.out.println("... Adding Speakers ...");
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()+30.0;
	}

}
