package creational.abstractt.factory.television;

public class LGLEDTelevision extends Television {

	public LGLEDTelevision(TelevisionPartsFactory televisionPartsFactory){
		System.out.println("LG LED Television Produced");
	}
	
	@Override
	public void otherFeatures() {
		// TODO Auto-generated method stub
		System.out.println("Included features ..");
	}

}
