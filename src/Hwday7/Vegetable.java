package Hwday7;

public class Vegetable extends Plant {

	byte isLeaf;
	
	
	public void cut2() {
		System.out.println(name + "切好后炒菜");
	}
	
	
	public Vegetable(String name, String season) {
		super(name, season);
		
	}

	public Vegetable() {
		this.isLeaf = (byte)("是".equals(isLeaf)?1 : 2);
		
	}

}
