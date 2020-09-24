package creational.factory.television;

public class SamsungPlasmaTelevision extends Television{
	
	SamsungPlasmaTelevision(){
		System.out.println("Samsung Plasma Television Produced");
	}

	@Override
	public void otherFeatures() {
		// TODO Auto-generated method stub
		System.out.println("Included features ..");
	}

}
