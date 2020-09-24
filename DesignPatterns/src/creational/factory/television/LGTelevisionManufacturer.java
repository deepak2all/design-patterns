package creational.factory.television;

public class LGTelevisionManufacturer extends TelevisionManufacturer{

	@Override
	protected Television createTelevision(TelevisionType televisionType) {
		// TODO Auto-generated method stub
		Television television = null;
		switch(televisionType){
			case LED:
				System.out.println("LG LED Television Chosen");
				television = new LGLEDTelevision();
				break;
			case LCD:
				System.out.println("LG LCD Television Chosen");
				television = new LGLCDTelevision();
				break;
			case PLASMA:
				System.out.println("LG PLASMA Television Chosen");
				television = new LGPlasmaTelevision();
				break;
			default:
				throw new RuntimeException("Unknown Television Type " + televisionType);
		}
		return television;
	}

}
