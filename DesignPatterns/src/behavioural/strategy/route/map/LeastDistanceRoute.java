package behavioural.strategy.route.map;

public class LeastDistanceRoute implements RouteStrategy {

	@Override
	public void applyStrategyTocalculate() {
		// TODO Auto-generated method stub
		System.out.println("The least distance route cost Rs.400."
				+ "There aren't 2 tolls."
				+ "It'd take just 2 hrs to reach the destination");
	}

	@Override
	public int totalCost() {
		// TODO Auto-generated method stub
		return 400;
	}

}
