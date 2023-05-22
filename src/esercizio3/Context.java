package esercizio3;

public class Context implements Observer {
	
	private Strategy myStrategy;

	@Override
	public void update(Observable o) {
		int state = ((Monitor)o).getState();
		this.setStrategy(state);
	}
	
	public void setStrategy(int state) {
		if (state == 0) {
			myStrategy = new ConcreteStrategy1("Strategy 1");
		}else {
			myStrategy = new ConcreteStrategy2("Strategy 2");
		}
	}
	
	public Strategy getStrategy() {
		return myStrategy;
	}
	
	public String op() {
		return this.myStrategy.op();
	}

}
