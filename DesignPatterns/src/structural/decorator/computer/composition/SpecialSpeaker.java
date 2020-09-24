package structural.decorator.computer.composition;

public class SpecialSpeaker extends Component {
	
    private final Component component;
    
    public SpecialSpeaker(Component component) {
        this.component = component;
    }
    
    @Override
    public void listFeatures() {
    	component.listFeatures();
        System.out.println("Adding --> 20 KHz royal speaker");
    }
    
    @Override
    public double getPrice() {
        return component.getPrice()
                + 30.0;
    }
}
