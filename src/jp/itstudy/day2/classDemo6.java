package jp.itstudy.day2;

public class classDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*定义二位数组
		 * 1.数据类型【】【】 变量名 = {
		 *                     {值1，值2},
		 *                     {值1，值2}
 * };
 * 2。数据类型【】【】  变量名  = new 数据类型【行长度】【列长度】
 * 数据类型【】【】= 值
 * 
 * 3.數據類型
 * 
 	*/
		String[][] studentAry = {
				{"zhou","shiyao","inn"},
				{"fan","wei","tan"}
		};
		/*for(int j = 0;j < 2;j++) {
			for(int i = 0;i < 3;i++) {
				System.out.print(studentAry[j][i]+" ");
			}
			System.out.println();
		}
		*/
		//行：數組名。length   x列：數組名[x-]。length
		System.out.println(studentAry.length);
		System.out.println(studentAry[0].length);
		System.out.println(studentAry[1].length);
		System.out.println(studentAry[2].length);
		for(int j = 0; j < studentAry.length;j++) {
			for(int i = 0;i < studentAry[j].length;i++) {
				System.out.print(studentAry[j][i]+" ");
			}
			System.out.println();
		}
		
		
	}

}
