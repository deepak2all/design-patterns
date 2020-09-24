package structural.decorator.computer.composition2;

public class BasicComputer extends Component {
	
    @Override
    public void listFeatures() {
        System.out.println("Keyboard");
        System.out.println("Mouse");
        System.out.println("Monitor");
        //etc
    }
    
    @Override
    public double getPrice() {
        return 100.0;
    }
}
