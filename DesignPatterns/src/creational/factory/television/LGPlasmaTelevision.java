package creational.factory.television;

public class LGPlasmaTelevision extends Television {

	LGPlasmaTelevision(){
		System.out.println("LG Plasma Television Produced");
	}
	
	@Override
	public void otherFeatures() {
		// TODO Auto-generated method stub
		System.out.println("Included features ..");
	}

}
