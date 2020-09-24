package structural.decorator.computer.composition2;

public class UPS extends ComponentDecorator {
	// Using Composition over Inheritance
    private final Component component;
    
    // Passing and setting the base product
    public UPS(Component component) {
        this.component = component;
    }
    
    @Override
    public void listFeatures() {
    	// Calling the method of the base class
    	component.listFeatures();
        // Appending the new features on top of it
        System.out.println("Adding --> Uninterrupted Power Supply");
    }
    
    @Override
    public double getPrice() {
    	// Adding the price of new feature on top
    	// of the price of the existing features
        return component.getPrice() + 40.0;
    }
}
