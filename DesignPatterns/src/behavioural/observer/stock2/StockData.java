package behavioural.observer.stock2;

import java.util.ArrayList;
import java.util.List;

public class StockData implements ObserverManageAndNotify {

	private List<Observer> observers = new ArrayList<>();
	private String stockSymbol;
	private String stockPrice;

	public StockData() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	// Getters
	public String getStockSymbol() {
		return stockSymbol;
	}

	public String getStockPrice() {
		return stockPrice;
	}
	
	// Common setter for setting all the required fields
	public void setNewStockPrice(String stockSymbol, String stockPrice) {
		this.stockSymbol = stockSymbol;
		this.stockPrice = stockPrice;
		stockPriceChanged();
	}

	/*
	 * Would make a call to overridden method "notifyObservers"
	 * This method would be called whenever the stockPrice is set
	 * Henceforth it's present in the setter method of the class
	 */
	private void stockPriceChanged() {
		// TODO Auto-generated method stub
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		observers.forEach(observer -> observer.update(stockSymbol, stockPrice));	
		/*for (Observer observer: observers) {
			observer.update(stockSymbol, stockPrice);
		}*/
	}

}
