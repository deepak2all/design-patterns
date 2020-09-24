package behavioural.observer.stock2;

public interface ObserverManageAndNotify {
	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
	
}
