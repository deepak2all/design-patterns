package creational.factory.television;

public class SamsungTelevisionManufacturer extends TelevisionManufacturer {

	@Override
	protected Television createTelevision(TelevisionType televisionType) {
		// TODO Auto-generated method stub
		Television television = null;
		switch(televisionType){
			case LED:
				System.out.println("Samsung LED Television Chosen");
				television = new SamsungLEDTelevision();
				break;
			case LCD:
				System.out.println("Samsung LCD Television Chosen");
				television = new SamsungLCDTelevision();
				break;
			case PLASMA:
				System.out.println("Samsung PLASMA Television Chosen");
				television = new SamsungPlasmaTelevision();
				break;
			default:
				throw new RuntimeException("Unknown Television Type " + televisionType);
		}
		return television;
	}

}
