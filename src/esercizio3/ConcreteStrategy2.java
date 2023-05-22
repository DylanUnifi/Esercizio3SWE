package esercizio3;

public class ConcreteStrategy2 implements Strategy {
	private String name;
	
	public ConcreteStrategy2(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public String op() {
		return this.getName();
	}

}
