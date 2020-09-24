package behavioural.strategy.route.map;

public class LeastCostRoute implements RouteStrategy {

	@Override
	public void applyStrategyTocalculate() {
		// TODO Auto-generated method stub
		System.out.println("The least cost route cost Rs.200."
				+ "There aren't any tolls."
				+ "But will take 3 hrs because of traffic");
	}

	@Override
	public int totalCost() {
		// TODO Auto-generated method stub
		return 200;
	}

}
