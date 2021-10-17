package homework8;

public class Zoo {

	private String  name;
	private double weight;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Zoo(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	public Zoo() {
		super();
	}
	
	public void show() {
		System.out.println(getName());
		System.out.println(getWeight());
	}
	
}
