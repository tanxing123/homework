package jp.itstudy.day2;

import java.util.Scanner;

public class Demo2 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
			String userName = sc.nextLine();
			String userPassword = sc.nextLine();
		//如果输入的用户名是root,密码是123456则显示邓丽成功
		//如果是string 比较是否相等时用equals去比较
			if("root".equals(userName) && "123456".equals(userPassword)) {
				System.out.println("登陆成功");
			}else {
				System.out.println("登录失败");
			}
			
			
			
	}

}
