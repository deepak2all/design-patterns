package creational.factory.television;

public class SamsungLCDTelevision extends Television {
	
	SamsungLCDTelevision(){
		System.out.println("Samsung LCD Television Produced");
	}

	@Override
	public void otherFeatures() {
		// TODO Auto-generated method stub
		System.out.println("Included features ..");
	}

}
