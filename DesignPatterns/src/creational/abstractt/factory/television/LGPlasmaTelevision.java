package creational.abstractt.factory.television;

public class LGPlasmaTelevision extends Television {
	
	LGPlasmaTelevision(TelevisionPartsFactory televisionPartsFactory){
		System.out.println("Boards created :: " + televisionPartsFactory.createBoard());
		System.out.println("Buttons created :: " + televisionPartsFactory.createButton());
		System.out.println("LG Plasma Television Produced");
	}

	@Override
	public void otherFeatures() {
		// TODO Auto-generated method stub
		System.out.println("Included features ..");
	}

}
