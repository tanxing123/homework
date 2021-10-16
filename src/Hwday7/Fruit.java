package Hwday7;

public class Fruit extends Plant {
	double price;
	double weight;
	
	public void cut() {
		System.out.println(name + "变juice");
	}
	
	
	public Fruit(String name, String season) {
		super(name, season);
		
	}

	public Fruit() {
		super();
	}

}

