package behavioural.strategy.route.map;

public class LeastTimeRoute implements RouteStrategy {

	@Override
	public void applyStrategyTocalculate() {
		// TODO Auto-generated method stub
		System.out.println("The least time route cost Rs.500."
				+ "There aren't 3 tolls."
				+ "However, It'd take just an hr to reach the destination");
	}

	@Override
	public int totalCost() {
		// TODO Auto-generated method stub
		return 500;
	}

}
