package homework8;

public class Jpitstudycrm {

	private int num;
	private String name;
	private double gongzi;
	byte age;
	byte gender;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGongzi() {
		String resultString = "*****";
		return resultString;
	}
	public void setGongzi(double gongzi) {
		this.gongzi = gongzi;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public byte getGender() {
		return gender;
	}
	public void setGender(byte gender) {
		this.gender = gender;
	}
	public Jpitstudycrm(int num, String name, double gongzi, byte age, byte gender) {
		super();
		this.num = num;
		this.name = name;
		this.gongzi = gongzi;
		this.age = age;
		this.gender = gender;
		
	}
	public Jpitstudycrm() {
		super();
	}
	
	public void work() {
		System.out.println(getName() + "���ڹ���");
	}
	public void show() {
		System.out.println("����:" + getName());
		System.out.println("Ա����:" + getNum());
		System.out.println("����:" + getAge());
		System.out.println("�Ա�:"+ getGender());
		System.out.println("����:"+ getGongzi());
	}
	
}
