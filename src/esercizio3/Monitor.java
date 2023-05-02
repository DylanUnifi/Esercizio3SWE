package esercizio3;

public class Monitor extends Observable {
	private int state = 0;
	public int getState() {
		return this.state;
	}
	
	public void setState(int state) {
		this.state = state;
		this.notifyObservers();
	}

}
