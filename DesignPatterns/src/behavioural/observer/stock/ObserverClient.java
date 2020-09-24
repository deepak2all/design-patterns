package behavioural.observer.stock;

public class ObserverClient {

	public ObserverClient() {
		// TODO Auto-generated constructor stub
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockData stockData = new StockData();
		stockData.stockPriceChanged("StockA", "10.5");
		stockData.stockPriceChanged("StockB", "11.5");
		
		/**
		 * Problems with the above approach
		 * The StockData class is TIGHTLY COUPLES to the dependent objects
		 * - CurrentStockDetailsDisplay and StatisticsStockDetailsDisplay.
		 * When we need to add a new object (or remove an existing object),
		 * then we have to change the stockData class.
		 * Here is when the Observer Pattern comes for rescue
		 */
	}

}
