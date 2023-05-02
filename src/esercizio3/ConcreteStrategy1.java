package esercizio3;

public class ConcreteStrategy1 implements Strategy {
	private String name;
	
	public ConcreteStrategy1(String name) {
		this.name = name;
	}

	@Override
	public String op() {
		System.out.println("Eseguo op() su" + this.name);
		return this.getName();
	}
	
	public String getName() {
		return name;
	}

}
