package Hwday7;

public class Animal {

	private String name;
	private double weight;
	private String color;
	private String likefood;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Double getWeight() {
		return this.weight;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	
	public void setLikefood(String likefood) {
		this.likefood = likefood;
	}
	public String getLikefood() {
		return this.likefood;
	}
	
	
	public Animal() {	
	}
	
	public Animal(String name, double weight, String color, String likefood) {
		this.name = name;
		this.weight = weight;
		this.color = color;
		this.likefood = likefood;
		
	}
	public void Treeclimbing() {
	System.out.println(name + "在爬树");
}
	public void canFly() {
		System.out.println(name + "在飞");
	}
	public void canJump() {
		System.out.println(name + "在跳");
	}
	
}
