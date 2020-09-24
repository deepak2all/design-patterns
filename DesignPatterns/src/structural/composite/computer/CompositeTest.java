package structural.composite.computer;

public class CompositeTest {

	public static void main(String[] args) {
		Component hd = new Leaf("HDD", 400);
		Component mouse = new Leaf("Mouse", 100);
		Component monitor = new Leaf("Monitor", 6000);
		Component ram = new Leaf("Ram", 2000);
		Component cpu = new Leaf("CPU", 10000);
		Component speaker = new Leaf("Speaker", 4000);
		Component kb = new Leaf("Keyboard", 500);
		
		Composite ph = new Composite("Peripheral");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("Motherboard");
		Composite computer = new Composite("Computer");
		
		ph.addComponent(mouse);
		ph.addComponent(kb);
		ph.addComponent(monitor);
		ph.addComponent(speaker);
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		cabinet.addComponent(mb);
		cabinet.addComponent(hd);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		System.out.println("PRICE OF RAM ::");
		ram.showPrice();
		System.out.println("====================================");
		
		System.out.println("PRICE OF Computer ::");
		computer.showPrice();
	}

}
