public class AnimalDemo {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		animal1.setName("考拉");
		
		animal1.setWeight(50D);
		
		animal1.setColor("黑白相间");
		
		animal1.setLikefood("橡树叶");
		
		animal1.setbellyPocket("有");
	
		animal1.Treeclimbing();
		animal1.showInfo();
		System.out.println("------------");
		
		Animaltuzu animal2 = new Animaltuzu();
		animal2.setName("小白兔--大白");
		
		animal2.setWeight(10D);
		
		animal2.setColor("白色");
	
		animal2.setLikefood("胡萝卜");
		
		animal2.setlongEars("短");
		animal2.canJump();
		animal2.showInfo();
		System.out.println("------------");
		
		Animaltuzu animal3 = new Animaltuzu();
		animal3.setName("小灰兔--大灰狼");
		
		animal3.setWeight(15D);
	
		animal3.setColor("灰色");
		
		animal3.setLikefood("青菜");
		
		animal3.setlongEars("长");
		animal3.canJump();
		animal3.showInfo();
		System.out.println("------------");
		
		Animalmao animal4 = new Animalmao();
		animal4.setName("猫头鹰--秃头");
		
		animal4.setWeight(20D);
		
		animal4.setColor("黑色");
		
		animal4.setLikefood("老鼠");
		
		animal4.canFly();
		animal4.showInfo();
		System.out.println("------------");
		Animalmao animal5 = new Animalmao();
		animal5.setName("猫头鹰--利眼");
		
		animal5.setWeight(25D);
		
		animal5.setColor("白灰色");
		
		animal5.setLikefood("昆虫");
		
		animal5.canFly();
		animal5.showInfo();
		System.out.println("------------");
		
		Animalmao animal6 = new Animalmao();
		animal6.setName("猫头鹰--邬");
		
		animal6.setWeight(23D);
		
		animal6.setColor("紫黑色");
		
		animal6.setLikefood("小鱼");
		
		animal6.canFly();
		animal6.showInfo();
		
		
		

	}

}
