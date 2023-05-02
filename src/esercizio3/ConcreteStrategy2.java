package esercizio3;

public class ConcreteStrategy2 implements Strategy {
	private String name;
	
	public ConcreteStrategy2(String name) {
		this.name = name;
	}
	
	public String getNane() {
		return name;
	}
	@Override
	public String op() {
		System.out.println("Eseguo op() su" + this.name);
		return name;
	}

}
