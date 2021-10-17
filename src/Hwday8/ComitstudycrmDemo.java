package homework8;

import java.util.Scanner;

public class ComitstudycrmDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入姓名");
		String a = scanner.next();
		System.out.println("请输入员工号");
		int b = scanner.nextInt();
		System.out.println("请输入年龄");
		byte c = scanner.nextByte();
		System.out.println("请输入性别");
		byte d = scanner.nextByte();
		System.out.println("请输入工资");
		double e = scanner.nextDouble();

		System.out.println("姓名:" + a);
		System.out.println("员工号:" + b);
		System.out.println("年龄:" + c);
		System.out.println("性别:"+ d);
		System.out.println("工资:"+e);
		
	}

}
