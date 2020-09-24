package structural.decorator.computer.composition;

public class BasicTelevision extends Component{

	@Override
	public void listFeatures() {
		// TODO Auto-generated method stub
		System.out.println("Screen");
        System.out.println("Recorder");
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 200.0;
	}

}
