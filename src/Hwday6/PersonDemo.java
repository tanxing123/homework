public class PersonDemo {
    public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.setName("谈星");
		person1.setAge(25);
		person1.setGander("男");
		person1.setStar("双鱼");
		person1.setPhone(570153816L);
		person1.Issleeping();
		person1.Iseating();
		person1.showInfo();
		System.out.println("------------");
		
		
		Person person2 = new Person();
		person2.setName("宇智波");
		person2.setAge(18);
		person2.setGander("男");
		person2.setStar("狮子");
		person2.setPhone(2021092500L);
		person2.Issleeping();
		person2.Iseating();
		person2.showInfo();
		
		
		

	}
}
