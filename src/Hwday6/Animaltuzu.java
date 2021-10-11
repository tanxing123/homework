public class Animaltuzu {

	private String name;
	private double weight;
	private String color;
	private String likefood;
	
	private byte LongEars;//1.有2.无
	
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
	

	
	public void setlongEars(String LongEars) {
		this.LongEars = (byte)("长".equals(LongEars)?1 : 2);
	}
	public String getlongEars() {
		return this.LongEars == 1?"长":"短";
	}
	
	public Animaltuzu() {	
	}
	
	public Animaltuzu(String name, double weight, String color, String likefood, String LongEars) {
		this.name = name;
		this.weight = weight;
		this.color = color;
		this.likefood = likefood;
		this.LongEars = 1;
	}

public void canJump() {
	System.out.println(name + "在跳");
}

public void showInfo() {
	System.out.println("名字:" + getName());
	System.out.println("体重:" + getWeight());
	System.out.println("颜色:" + getColor());
	System.out.println("喜爱食物:" + getLikefood());

	System.out.println("耳朵长短:" + getlongEars());
}
	
	
	

}
