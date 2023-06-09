package esercizio3;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	protected void notifyObservers() {
		for (Observer o : observers) {
			o.update(this);
		}
	}
}