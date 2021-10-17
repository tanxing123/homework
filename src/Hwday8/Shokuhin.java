package homework8;

public class Shokuhin {

	private String name;
	private double price;
	private String qixian;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getQixian() {
		return qixian;
	}
	public void setQixian(String qixian) {
		this.qixian = qixian;
	}
	public Shokuhin(String name, double price, String qixian) {
		super();
		this.name = name;
		this.price = price;
		this.qixian = qixian;
	}
	public Shokuhin() {
		super();
	}

	public void display() {
		System.out.println("商品:" + getName() + "  "+ getPrice()+"円" + "  "+ "商品期限:"+ getQixian());
	}
}
