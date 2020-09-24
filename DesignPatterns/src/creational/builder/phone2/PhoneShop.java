package creational.builder.phone2;

public class PhoneShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone.Builder("Androd", "snapdragon", 3900)
										.setCamera(20).setScreenSize(5)
										.build();
		System.out.println(phone);
	}

}
