package homework8;

public class StudentDemo {

	public static void main(String[] args) {
		Student student1 = new Student(001,"̸��","˫��","���ɻ�",132366744L);
		Student student2 = new Student(001,"����","˫��","���ɻ�",1355444444L);
		Student student3 = new Student(001,"���ǲ�","˫��","���ɻ�",136674432L);
		System.out.println(student1);
		System.out.println(student1.toString());
		System.out.println(student1.hashCode());
		System.out.println("-----------------");
		System.out.println(student2);
		System.out.println(student2.toString());
		System.out.println(student2.hashCode());
		System.out.println("-----------------");
		System.out.println(student3);
		System.out.println(student3.toString());
		System.out.println(student3.hashCode());
		System.out.println(student1.equals(student2));
		System.out.println(student1.equals(student3));
		System.out.println(student2.equals(student3));
	}

}
