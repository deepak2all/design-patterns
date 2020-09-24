package structural.decorator.computer.composition;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("FOR COMPUTER COMPONENT");
        Component computer = new BasicComputer();
        computer.listFeatures();
        System.out.println("Total is " + computer.getPrice());
        System.out.println("----------------------------------");
        System.out.println("FOR COMPUTER COMPONENT along with other decorator components");
        computer = new UPS(computer);
        computer = new SpecialSpeaker(computer);
        computer.listFeatures();
        System.out.println("Total is " + computer.getPrice());
        System.out.println("----------------------------------");
        
        System.out.println("FOR TELEVISION COMPONENT");
        Component tv = new BasicTelevision();
        tv.listFeatures();
        System.out.println("Total is " + tv.getPrice());
        System.out.println("----------------------------------");
        System.out.println("FOR TELEVISON COMPONENT along with other decorator components");
        tv = new UPS(tv);
        tv = new SpecialSpeaker(tv);
        tv.listFeatures();
        System.out.println("Total is " + tv.getPrice());
        System.out.println("----------------------------------");
        
	}

}
