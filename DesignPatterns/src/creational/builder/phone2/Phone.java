package creational.builder.phone2;

public class Phone {

	private String os;
	private String processor;
	private double screenSize;
	private int battery;
	private int camera;
	
	public Phone(String os, String processor, double screenSize, int battery, int camera) {
		super();
		this.os = os;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
		this.camera = camera;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", screenSize=" + screenSize + ", battery=" + battery
				+ ", camera=" + camera + "]";
	}
	
	public static class Builder {
		
		final private String os;
		final private String processor;
		final private int battery;
		private double screenSize;
		private int camera;
		
		public Builder(String os, String processor, int battery) {
			super();
			this.os = os;
			this.processor = processor;
			this.battery = battery;
		}
		
		public Builder setScreenSize(double screenSize) {
			this.screenSize = screenSize;
			return this;
		}

		public Builder setCamera(int camera) {
			this.camera = camera;
			return this;
		}
		
		public final Phone build(){
			return new Phone(os, processor, screenSize, battery, camera);
		}
	}
}
