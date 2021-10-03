package cn.jp.itstudy20210925.day3;

public class Demo3 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String val1 = "50";
		int val2 = Integer.valueOf(val1);
		char val3 = (char)val2;
		System.out.println(val3);
		//基本String
	
		
		int start =3;
		switch (start) {
		case 1:
			System.out.println("⭐");
			break;
		case 2:
			System.out.println("⭐⭐");
			break;
		case 3:
			System.out.println("⭐⭐⭐");
			break;
		case 4:
			System.out.println("⭐⭐⭐⭐");
			break;
		case 5:
			System.out.println("⭐⭐⭐⭐⭐");
			break;
			
			}
		
		/*
		 * for 表达式。表达式2，表达式3{
		 * 循环体
		 * }
		 * 表达式1：初始话一个变量，用于计算次数
		 * 表达式2：阈值
		 * 
		 * 
		 */
		for(int j = 1; j <6; j++) {
			for(int i = 1; i < 5;++i) {
			System.out.print("i");
		}
		System.out.println("");
		}
		
	}

}
