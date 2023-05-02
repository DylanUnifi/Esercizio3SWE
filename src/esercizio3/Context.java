package esercizio3;

public class Context implements Observer {
	
	private int state;
	private Strategy[] myStrategy;
	
	public Context() {
		this.state = 0;
		this.myStrategy = new Strategy[2];
		this.myStrategy[0] = new ConcreteStrategy1("Strategy 1");
		this.myStrategy[1] = new ConcreteStrategy2("Strategy 2");
	}

	@Override
	public void update(Observable o) {
		int state = ((Monitor)o).getState();
		this.setStrategy(state);
	}
	
	public void setStrategy(int state) {
		this.state = state;
	}
	
	public String op() {
		return this.myStrategy[this.state].op();
	}

}
