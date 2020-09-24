package creational.factory.television;

public class LGLEDTelevision extends Television {

	LGLEDTelevision(){
		System.out.println("LG LED Television Produced");
	}
	
	@Override
	public void otherFeatures() {
		// TODO Auto-generated method stub
		System.out.println("Included features ..");
	}

}
