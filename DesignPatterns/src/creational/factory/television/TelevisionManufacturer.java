package creational.factory.television;

public abstract class TelevisionManufacturer {

	protected void manufactureTelevision(TelevisionType televisionType) {
		Television television = createTelevision(televisionType);
		television.qualityCheck();
		television.box();
	}

	protected abstract Television createTelevision(TelevisionType televisionType);
}
