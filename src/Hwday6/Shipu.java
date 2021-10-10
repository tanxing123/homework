public class Shipu {
	/*第三：
	食谱列 （5个属性，2个方法），构造器，封装。
	生成2个食谱。分别调用2个方法*/
	
	String name;
	String time;
	String method;
	int number;
	String material;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	public String getTime() {
		return this.time;
	}
	
	public void setMethod(String method) {
		this.method = method;
	}
	public String getMethod() {
		return this.method;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return this.number;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMaterial() {
		return this.material;
	}
	
	public Shipu() {	
	}
	
	public Shipu(String name, String time, String method, int number, String material) {
		this.name = name;
		this.time = time;
		this.method = method;
		this.number = number;
		this.material = material;
	}
	public void showShiPu() {
	System.out.println("菜名:" + getName());
	System.out.println("所需时间:" + getTime());
	System.out.println("做饭方法:" + getMethod());
	System.out.println("适合人数:" + getNumber());
	System.out.println("主要材料:" + getMaterial());
	
}




}
