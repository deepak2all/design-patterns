package creational.abstractt.factory.television;

public class AbsFactoryClientMain {

	public static void main(String[] args) {
		TelevisionManufacturer tvm3 = new LGTelevisionManufacturer();
		tvm3.manufactureTelevision(TelevisionType.LED);
		System.out.println("=======================================");
		tvm3.manufactureTelevision(TelevisionType.PLASMA);
	}
	
}
