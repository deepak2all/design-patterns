package creational.abstractt.factory.television;

public abstract class TelevisionManufacturer {

	public void manufactureTelevision(TelevisionType televisionType){
		Television television = createTelevision(televisionType);
		television.otherFeatures();
		television.qualityCheck();
		television.box();
	}
	
	protected abstract Television createTelevision(TelevisionType televisionType);
}
