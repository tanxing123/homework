package co.jp.itstudy.homework20210925.day3;

public class classDemo4 {

	public static void main(String[] args) {
		/*
		 * break  停止循环
		 * continue 跳过此次循环,继续循环
		 */
		for(int i = 1; i < 8;i++) {
			if(i ==6) {
				System.out.println("下雨天不跑步");
				//continue;
				break;
			}
			System.out.println("第"+i+"天坚持跑步");
		}
		
		c: for(int a =1;a <6;a++) {
			d: for(int b =1;b <6;b++) {
				/*if(b ==3){
					break;
				}*/
		System.out.print("行:"+a+"列:"+b);
			}
		System.out.println();
		}
	}
}
