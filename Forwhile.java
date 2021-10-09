package jp.itstudy.day2;

import java.util.Scanner;

public class Forwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		/*while(flag) {
		System.out.println("清楚如一个值,'exit'则停止");
		String string = scanner.nextLine();
		if("exit".equals(string)) {
			System.out.println("游戏结束");
			flag = false;
		}else {
			System.out.println(">>" + string);
		}*/
		
		do {
			System.out.println("清楚如一个值,'exit'则停止");
			String string = scanner.nextLine();
			if("exit".equals(string)) {
				System.out.println("游戏结束");
				flag = false;
			}else {
				System.out.println(">>" + string);
			}
			}while(flag);
		
		
		
	}

}
