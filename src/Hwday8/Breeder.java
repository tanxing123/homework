package homework8;

public class Breeder {
	
	String name;

	public Breeder(String name) {
		super();
		this.name = name;
		
	}

	public Breeder() {
		super();
	}
	
	public void feeding(Zoo obj) {
		if(obj instanceof Panda) {
			Panda obj1 = (Panda)obj;
			obj1.eat();
		}
		if(obj instanceof Tiger) {
			Tiger obj2 = (Tiger)obj;
			obj2.eat();
		}
		if(obj instanceof Monkey) {
			Monkey obj3 = (Monkey)obj;
			obj3.eat();
		}
		
		
	}
}