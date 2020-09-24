package creational.factory.phone;

import creational.factory.phone.OS;
import creational.factory.phone.OSFactory;

public class FactoryMain {

	public static void main(String[] args) {
		OS os1 = OSFactory.getInstance("closed");
		os1.spec();
		OS os2 = OSFactory.getInstance("open");
		os2.spec();
	}

}
