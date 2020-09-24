package behavioural.observer.stock2;

public class ObserverClient2 {

	public ObserverClient2() {
		// TODO Auto-generated constructor stub
		super();
	}

	public static void main(String[] args) {
		// The class which needs to be observed
		StockData stockData = new StockData();
		
		// The observers
		// Take in the class that needs to be observed as its arg
		// As the observed class is an implementation if ObserverManageAndNotify
		CurrentStockDetailsDisplay2 csdd = new CurrentStockDetailsDisplay2(stockData);
		StatisticsStockDetailsDisplay2 ssdd = new StatisticsStockDetailsDisplay2(stockData);
		stockData.setNewStockPrice("StockA", "12.5");
		stockData.setNewStockPrice("StockB", "13.5");
	}

}
