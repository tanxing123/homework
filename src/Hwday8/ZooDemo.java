package homework8;

public class ZooDemo {

	public static void main(String[] args) {
		
		Panda panda = new Panda("����",40D);
		panda.eat();
		
		Panda panda2 = new Panda("ԲԲ",30D);
		panda2.eat();
		
		Tiger tiger = new Tiger("����",100D);
		tiger.eat();
		
		Monkey monkey = new Monkey("��1",25D);
		monkey.eat();
		
		Monkey monkey2 = new Monkey("��2",25D);
		monkey2.eat();
		
		Monkey monkey3 = new Monkey("��3",25D);
		monkey3.eat();
		
		Monkey monkey4 = new Monkey("��4",25D);
		monkey4.eat();
		
		Monkey monkey5 = new Monkey("��5",25D);
		monkey5.eat();
		System.out.println("==============");
		Breeder breeder = new Breeder("̸��");
		System.out.println(breeder.name + "��ι����");
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
