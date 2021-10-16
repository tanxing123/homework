package Hwday7;

public class PlantDemo {


	public static void main(String[] args) {
		
		Fruit fruit = new Fruit();
		fruit.name = "苹果";
		fruit.season = "秋季";
		fruit.price = 16.5D;
		fruit.weight = 2.3D;
		fruit.cut();
		
		Vegetable vegetable = new Vegetable("白菜","冬季");
		vegetable.isLeaf = 1;
		vegetable.cut2();
		System.out.println("=============");
		Cheaf cheaf = new Cheaf("谈星");
		System.out.println(cheaf.name +"在做菜");
		cheaf.cooking(fruit);
		cheaf.cooking(vegetable);
		
	}

}