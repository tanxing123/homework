public class StudentDemo {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.show();
		student1.id =20210001;
		student1.studentName = "王德住";
		student1.birthday = "10-21";
		student1.number = 159875462;
		student1.star = "白羊座";
		student1.address = "松户站";
		student1.gender = 0;
		System.out.println("------------");
		student1.show();
		
		Student student2 = new Student();
		student2.id =20210002;
		student2.studentName = "赵日升";
		student2.birthday = "10-08";
		student2.number = 159858422;
		student2.star = "狮子座";
		student2.address = "新松户站";
		student2.gender = 0;
		System.out.println("------------");
		student2.show();
		
		Student student3 = new Student();
		student3.id =20210003;
		student3.studentName = "王雨萌";
		student3.birthday = "12-06";
		student3.number = 159589462;
		student3.star = "双鱼座";
		student3.address = "新宿站";
		student3.gender = 1;
		System.out.println("------------");
		student3.show();
		
		Student student4 = new Student();
		student4.id =20210004;
		student4.studentName = "宇智波佐助";
		student4.birthday = "05-21";
		student4.number = 1289423644;
		student4.star = "巨蟹座";
		student4.address = "高田马场站";
		student4.gender = 0;
		System.out.println("------------");
		student4.show();
		
		Student student5 = new Student();
		student5.id =20210005;
		student5.studentName = "春叶樱";
		student5.birthday = "09-18";
		student5.number = 159855864;
		student5.star = "金牛座";
		student5.address = "涩谷站";
		student5.gender = 1;
		System.out.println("------------");
		student5.show();
		
		
		
		

	}

}
