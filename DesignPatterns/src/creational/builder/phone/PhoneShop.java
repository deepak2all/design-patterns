package creational.builder.phone;

public class PhoneShop {

	public static void main(String[] args) {
		/*Phone p = new Phone("Android", "QualComm", 5.5, 3100, 13);
		System.out.println(p);*/
		
		/*
		 * Major Advantages
		 * 1. Not all components are mandatory
		 * 2. Ordering of the components can be changed
		 * 
		 * Procedure to create
		 * 1. Have a class with components
		 * 2. Create only the setter methods for the components and return "this"
		 * 3. Have one getter method that returns the product taking
		 * all the components are arguments
		 */
		
		Phone p1 = new PhoneBuilder().setBattery(2100).setCamera(15).getPhoneFromPhoneBuilder();
		System.out.println(p1);
		
		Phone p2 = new PhoneBuilder().setOs("Android").setScreenSize(5.5).setBattery(2100).setCamera(20).getPhoneFromPhoneBuilder();
		System.out.println(p2);
		
		Phone p3 = new PhoneBuilder().setOs("Android").setProcessor("SnapDragon").setScreenSize(5.5).setBattery(2100).setCamera(15).getPhoneFromPhoneBuilder();
		System.out.println(p3);
		
		Phone phUsingBuilder2 = new PhoneBuilder2("Android", "SnapDragon", 2100)
								.setScreenSize(5.5).setCamera(20)
								.getPhoneFromPhoneBuilder2();
		System.out.println(phUsingBuilder2);
	}

}
