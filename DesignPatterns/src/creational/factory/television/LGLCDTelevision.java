package creational.factory.television;

public class LGLCDTelevision extends Television {

	LGLCDTelevision(){
		System.out.println("LG LCD Television Produced");
	}
	
	@Override
	public void otherFeatures() {
		// TODO Auto-generated method stub
		System.out.println("Included features ..");
	}

}
