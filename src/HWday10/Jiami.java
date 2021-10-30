package hw10;

import java.util.Scanner;
/*2、シーザー暗号を復元する問題です。
文字を何文字がずらすことで暗号を復元することができます。
例えば「abc」を4文字づつずらすと「efg」という暗号になります。
入力で与えられる暗号は何文字ずれているかわかりませんが、
「the」・「that」・「this」のいづれかが含まれているので、
それらを頼りに復元します。*/
public class Jiami {

	public static void main(String[] args) {

			Scanner scanner=new Scanner(System.in);
			System.out.println("请输入需要转换的暗号原文");
			//「the」・「that」・「this」
			String val = scanner.nextLine();
			
			 System.out.println("转换后的暗号是：");
			for (int i = 0, j = val.length(); i < j; i++) {
				char ch = val.charAt(i);
			
				if(ch>='a'&&ch<'z') {
					char x = (char)(ch+4); 
				    System.out.print(x);

				}else if(ch=='z') {
					char x = (char)(ch+4); 
				    System.out.print(x);
				}else if(ch=='a') {
					char x = (char)('z'+3); 
				    System.out.print(x);
				}
			
			}	
			
		} 
	}


