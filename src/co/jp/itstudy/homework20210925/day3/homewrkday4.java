package co.jp.itstudy.homework20210925.day3;

import java.util.Scanner;

public class homewrkday4 {

	public static void main(String[] args) {
		
		//第一题。金字塔
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<(5-i);j++) {
				System.out.print(" ");
			}
			for(int j = 0;j<i*2+1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		/*第二题
		 * 找aba
		 * 100--999
		 * 101,212
		 */
		int a = 100;
		do {
			if((a/100) == (a%10) && ((a/10)%10) != (a/100)) {
				System.out.println(a);
			}
			a++;
		}while(a < 999);
		
		
		/*第三题
		 * 输入值，
		 * ===》输出值
		 * 直到我们输入的值"exit"
		 * eg：
		 * abc
		 * ===》abc
		 * aaaa
		 * ===》aaaa
		 * bbb
		 * ===》bbb
		 *exit
		 *game over
		 *程序结束 
		  */
		Scanner scanner = new Scanner(System.in);
		String nam = scanner.next();
		if("exit".equals(nam)){
			System.out.println("game over");
		}
		System.out.println(nam);

	
		/*第四题
		 * 定义一个数组，村总武线
		 * 从新宿--》秋叶原
		 * 通过扫描器输入目的地：秋叶原
		 * 输出：新宿--》秋叶原要多少站
		 * 新宿 ，代々木、千駄ヶ谷、信濃町、四谷、市ヶ谷、飯田橋、水道橋、御茶ノ水、秋葉原
		 * 
		 */
		
		
		
		
		
		
		
		/*第五题
		 * int[] studentLunckNum = {4,15,7,8,9,6,5,19}
		 * max =4
		 * 找到最大值，最小值，求平均值
		 */
		 
		
		
		
		
		
		
		
		
		/*第6题
		 * 定义二位数组
		 * 日本都，县
		 * {
			{"台東区","千代田区","港区","中央区"},
			{"船橋市","千葉市"}
			。。。。
			}
			遍历出来
		 */
		
		
		
		
		
		
		
	}
	}


