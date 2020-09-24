package behavioural.observer.stock;

public class CurrentStockDetailsDisplay {
	
	public CurrentStockDetailsDisplay(){
		
	}
	
	public void update(String stockSymbol, String stockPrice){
		System.out.println("Got an update for "+ stockSymbol +
				" inside CurrentStockDetailsDisplay");
		display(stockSymbol, stockPrice);
		System.out.println("============================================");
	}

	private void display(String stockSymbol, String stockPrice) {
		// TODO Auto-generated method stub
		System.out.println("Stock Symbol - " + stockSymbol + "; "
				+ "Stock price - " + stockPrice);
	}

}
