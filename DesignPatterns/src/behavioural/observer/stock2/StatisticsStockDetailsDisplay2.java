package behavioural.observer.stock2;

public class StatisticsStockDetailsDisplay2 implements Observer, DisplayElement {
	
	private final ObserverManageAndNotify observerManageAndNotify;
	private String stockSymbol;
	private String stockPrice;
	
	StatisticsStockDetailsDisplay2(ObserverManageAndNotify observerManageAndNotify){
		this.observerManageAndNotify = observerManageAndNotify;
		this.observerManageAndNotify.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Inside StatisticsStockDetailsDisplay2");
		System.out.println("Stock Symbol - " + stockSymbol + "; "
				+ "Stock price - " + stockPrice);
		System.out.println("============================================");
	}

	@Override
	public void update(String stockSymbol, String stockPrice) {
		// TODO Auto-generated method stub
		this.stockSymbol = stockSymbol;
		this.stockPrice = stockPrice;
		display();
	}

}
