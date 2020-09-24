package creational.builder.phone;

public class PhoneBuilder2 {

	final private String os;
	final private String processor;
	final private int battery;
	private double screenSize;
	private int camera;

	public PhoneBuilder2(String os, String processor, int battery) {
		super();
		this.os = os;
		this.processor = processor;
		this.battery = battery;
	}
	
	public PhoneBuilder2 setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}

	public PhoneBuilder2 setCamera(int camera) {
		this.camera = camera;
		return this;
	}
	
	public final Phone getPhoneFromPhoneBuilder2(){
		return new Phone(os, processor, screenSize, battery, camera);
	}
}
