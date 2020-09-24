package behavioural.observer.stock2;

public class CurrentStockDetailsDisplay2 implements Observer, DisplayElement {

	// Have ObserverManageAndNotify as FINAL interface object
	private final ObserverManageAndNotify observerManageAndNotify;
	private String stockSymbol;
	private String stockPrice;
	
	// Hold the value of the interface object &
	// Register it using registerObserver
	public CurrentStockDetailsDisplay2(ObserverManageAndNotify observerManageAndNotify){
		this.observerManageAndNotify = observerManageAndNotify;
		this.observerManageAndNotify.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Inside CurrentStockDetailsDisplay2");
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
