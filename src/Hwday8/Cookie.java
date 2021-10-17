package homework8;

public class Cookie extends Shokuhin {

	private int pingjia;
	private String aji;
	
		
	
	public int getPingjia() {
		return pingjia;
	}

	public void setPingjia(int pingjia) {
		this.pingjia = pingjia;
	}

	public String getAji() {
		return aji;
	}

	public void setAji(String aji) {
		this.aji = aji;
	}

	public Cookie(String name, double price, String qixian, int pingjia, String aji) {
		super(name, price, qixian);
		this.pingjia = pingjia;
		this.aji = aji;
	}

	public Cookie() {
		super();
	}
	
	public void display() {
		System.out.println(getName() + "ケーキ"+ "  "+ getPrice()+"円" + "  "+ "商品期限:"+ getQixian()
							+"评价:" +getPingjia()+"  " + "味道:" + getAji());
	}
	
}
