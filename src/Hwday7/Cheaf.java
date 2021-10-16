package Hwday7;
public class Cheaf {

	String name;

	public Cheaf(String name) {
		super();
		this.name = name;
	}
	
	public void cooking(Plant obj) {
		if(obj instanceof Fruit) {
			Fruit obj1 = (Fruit) obj;
			obj1.cut();
		}
		if(obj instanceof Vegetable) {
			Vegetable obj2 = (Vegetable) obj;
			obj2.cut2();
		}
	}
	
	
}
