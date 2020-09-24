package behavioural.observer.stock;

public class StockData {
	
	private String stockSymbol;
	private String stockPrice;

	public StockData() {
		// TODO Auto-generated constructor stub
	}
	
	public String getStockSymbol() {
		return stockSymbol;
	}

	public String getStockPrice() {
		return stockPrice;
	}
	
	public void stockPriceChanged(String stockSymbol, String stockPrice) {
		this.stockSymbol = stockSymbol;
		this.stockPrice = stockPrice;
		
		// Observer 1
		CurrentStockDetailsDisplay csdd = new CurrentStockDetailsDisplay();
		csdd.update(stockSymbol, stockPrice);
		
		// Observer 2
		StatisticsStockDetailsDisplay ssdd = new StatisticsStockDetailsDisplay();
		ssdd.update(stockSymbol, stockPrice);
	}

}
