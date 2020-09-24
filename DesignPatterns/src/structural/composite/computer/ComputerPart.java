package structural.composite.computer;

import java.util.ArrayList;
import java.util.List;

	interface Component {
		void showPrice();
	}
	
	 class Leaf implements Component {

		String componentName;
		int componentPrice;
		
		
		public Leaf(String componentName, int componentPrice) {
			super();
			this.componentName = componentName;
			this.componentPrice = componentPrice;
		}

		@Override
		public void showPrice() {
			// TODO Auto-generated method stub
			System.out.println("Leaf [componentName=" + componentName + ", componentPrice=" + componentPrice + "]");
		}

		@Override
		public String toString() {
			return "Leaf [componentName=" + componentName + ", componentPrice=" + componentPrice + "]";
		}
		
	}
	
	class Composite implements Component {

		String compositeComponentName;
		
		List<Component> components = new ArrayList<>();
		
		public Composite(String compositeComponentName) {
			super();
			this.compositeComponentName = compositeComponentName;
		}

		public void addComponent(Component component){
			components.add(component);
		}
		
		public void removeComponent(Component component){
			components.remove(component);
		}
		
		@Override
		public void showPrice() {
			// This should show the prices of all the components
			// If the list has composite component, it'd traverse further until the leaf component is reached
			System.out.println(compositeComponentName);
			components.stream().forEach(c -> c.showPrice());
		}
		
	}
