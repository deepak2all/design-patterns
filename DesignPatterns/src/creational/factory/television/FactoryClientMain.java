package creational.factory.television;

public class FactoryClientMain {

	public static void main(String[] args) {
		TelevisionManufacturer tvm1 = new SamsungTelevisionManufacturer();
		tvm1.manufactureTelevision(TelevisionType.LED);
		TelevisionManufacturer tvm2 = new LGTelevisionManufacturer();
		tvm2.manufactureTelevision(TelevisionType.PLASMA);
	}

}
