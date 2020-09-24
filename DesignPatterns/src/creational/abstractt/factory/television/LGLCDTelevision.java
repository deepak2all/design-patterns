package creational.abstractt.factory.television;

public class LGLCDTelevision extends Television {

	public LGLCDTelevision(TelevisionPartsFactory televisionPartsFactory){
		System.out.println("LG LCD Television Produced");
	}
	
	@Override
	public void otherFeatures() {
		// TODO Auto-generated method stub
		System.out.println("Included features ..");
	}

}
