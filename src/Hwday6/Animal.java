public class Animal {

	/*第一大题
	1，考拉： name ，weigth，color， likefood，BellyPocket
	爬上Tree climbing（xxx在爬上）
	showInfo（）{所有属性都打印}
	2，小兔子： name，weight，color ， likefood，Long ears
	canJump（xx在条）
	showInfo（）{所有属性都打印}
	3，猫头鹰：name  ，weight，color，likefood，
	canFly（xxx在非）
	showInfo（）{所有属性都打印}
	每个动物都需要封装每个属性。写2个构造器（空，全参数）
	4，执行类。1只考拉，2条兔子，3猫头鹰
	*/
		private String name;
		private double weight;
		private String color;
		private String likefood;
		private byte BellyPocket;//1.有2.无
		
		
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
		
		public void setbellyPocket(String BellyPocket) {
			this.BellyPocket = (byte)("有".equals(BellyPocket)?1 : 2);
		}
		public String getbellyPocket() {
			return this.BellyPocket == 1?"有":"无";
		}
		
		
		
		public Animal() {	
		}
		
		public Animal(String name, double weight, String color, String likefood, String BellyPocket) {
			this.name = name;
			this.weight = weight;
			this.color = color;
			this.likefood = likefood;
			this.BellyPocket = 1;
		}
	public void Treeclimbing() {
		System.out.println(name + "在爬树");
	}
	
	public void showInfo() {
		System.out.println("名字:" + getName());
		System.out.println("体重:" + getWeight());
		System.out.println("颜色:" + getColor());
		System.out.println("喜爱食物:" + getLikefood());
		System.out.println("有无腹带:" + getbellyPocket());
		
	}
	
	
	

}

