package Hwday7;

public class Animaltuzi extends Animal {

	private byte LongEars;//1.有2.无
	
	public void setlongEars(String LongEars) {
		this.LongEars = (byte)("长".equals(LongEars)?1 : 2);
	}
	public String getlongEars() {
		return this.LongEars == 1?"长":"短";
	}
	public Animaltuzi() {
		
	}

	public Animaltuzi(String name, double weight, String color, String likefood) {
		super(name, weight, color, likefood);
		this.LongEars = LongEars;
	}

	
}
