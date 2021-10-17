package homework8;

public class ZooDemo {

	public static void main(String[] args) {
		
		Panda panda = new Panda("团团",40D);
		panda.eat();
		
		Panda panda2 = new Panda("圆圆",30D);
		panda2.eat();
		
		Tiger tiger = new Tiger("大王",100D);
		tiger.eat();
		
		Monkey monkey = new Monkey("猴1",25D);
		monkey.eat();
		
		Monkey monkey2 = new Monkey("猴2",25D);
		monkey2.eat();
		
		Monkey monkey3 = new Monkey("猴3",25D);
		monkey3.eat();
		
		Monkey monkey4 = new Monkey("猴4",25D);
		monkey4.eat();
		
		Monkey monkey5 = new Monkey("猴5",25D);
		monkey5.eat();
		System.out.println("==============");
		Breeder breeder = new Breeder("谈星");
		System.out.println(breeder.name + "在喂动物");
		breeder.feeding(panda);
		breeder.feeding(panda2);
		breeder.feeding(tiger);
		breeder.feeding(monkey);
		breeder.feeding(monkey2);
		breeder.feeding(monkey3);
		breeder.feeding(monkey4);
		breeder.feeding(monkey5);
		

	}

}
