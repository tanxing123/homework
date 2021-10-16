package Hwday7;

public class Animalkl extends Animal{

	private byte BellyPocket;//1.有2.无
	

	public void setbellyPocket(String BellyPocket) {
		this.BellyPocket = (byte)("有".equals(BellyPocket)?1 : 2);
	}
	
	public Animalkl() {
		super();
	}
}
