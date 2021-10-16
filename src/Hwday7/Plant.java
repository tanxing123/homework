package Hwday7;

public class Plant {
    String name;
	String season;
	public Plant(String name, String season) {
		super();
		this.name = name;
		this.season = season;
	}
	public Plant() {
		super();
	}
	
	public void show() {
		System.out.println(name + "在" + season);
	} 
}
