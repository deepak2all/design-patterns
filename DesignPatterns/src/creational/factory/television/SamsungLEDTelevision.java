package creational.factory.television;

public class SamsungLEDTelevision extends Television {
	
	SamsungLEDTelevision(){
		System.out.println("Samsung LED Television Produced");
	}

	@Override
	public void otherFeatures() {
		// TODO Auto-generated method stub
		System.out.println("Included features ..");
	}

}
