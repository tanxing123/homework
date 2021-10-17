package homework8;

public class Person {

	private String name;
	private byte age;
	private String address;
	private long tel;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		String resultString = tel/10000 + "****";
		return resultString;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}

	public Person(String name, byte age, String address, long tel) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.tel = tel;
	}

	public Person() {
		super();
	}
	
	public void showMy() {
		System.out.println("姓名:" + getName());
		System.out.println("年龄:" + getAge());
		System.out.println("住址:" + getAddress());
		System.out.println("电话:" + getTel());
	}
}
