package jp.itstudy.day2;


import java.util.Scanner;



import org.omg.CORBA.PUBLIC_MEMBER;

public class Hanshu {

		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("请输入年龄");
		byte age = scanner.nextByte();
				System.out.println("请输入你的性别");
		String gender = scanner2.nextLine();
		double price = buy(age,gender);
		System.out.println("你需要付:" + price);
		}
			
			public static double buy(byte age,String gender) {
				double newPrice = 0;
				double price = 3000D;
				if(age <= 15 || age >= 60) {
					newPrice = price*0.5;
				}else if(age > 15 && age <= 22) {
					newPrice = price*0.8;
				}else {
					newPrice = price*0.9;
				}
				
				
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

