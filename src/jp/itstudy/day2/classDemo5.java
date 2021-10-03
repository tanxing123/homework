package jp.itstudy.day2;

public class classDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*数组   配列
 * 变量是一个值
 * 数据类型【】 数组名={}
 * 数组名[索引位置]，索引位置
	*/	
		/*int luo = 4;
		int cai =15;
		int wei =7;
		int zhang =8;
		int hui =9;
		int sss =6;
		int juh = 5;
	
		int[] studentLuckyNum = {4,15,7,8,9,6,5};
		System.out.println(studentLuckyNum[0]);
		System.out.println(studentLuckyNum[1]);
		System.out.println(studentLuckyNum[2]);
		System.out.println(studentLuckyNum[3]);
		System.out.println(studentLuckyNum[4]);
		System.out.println(studentLuckyNum[5]);
		System.out.println(studentLuckyNum[6]);
		
		System.out.println(studentLuckyNum.length);
		
		for(int i = 0;i<studentLuckyNum.length;i++) {
			System.out.println(studentLuckyNum[i]);
		}
		
		
		String[] studentAry = new String[7];
		studentAry[0] = "luo";
		studentAry[1] = "zhou";
		studentAry[2] = "shi";
		studentAry[3] = "inn";
		studentAry[4] = "fan";
		studentAry[5] = "wei";
		studentAry[6] = "tan";
		
		System.out.println(studentAry.length);
		
		for(int i = 0; i <studentAry.length;i++) {
		System.out.println(studentAry[i]);
		}
		
		
		char[] ary = new char[7];
		ary[0] = 'L';
		ary[1] = 'Z';
		ary[2] = 'C';
		ary[3] = 'Y';
		ary[4] = 'B';
		ary[5] = 'S';
		ary[6] = 'T';
		System.out.println(ary.length);
		for(int i = 0; i <ary.length;i++) {
			System.out.println(ary[i]);
			}
		*/
		//第三种类型  变量名 = new 数据类型[]{值1值2值3}
		char[] ary = new char[]	{'L','S'};	
		for(int i = 0;i <ary.length;i++) {
			System.out.println((int)ary[i]);
		}
		System.out.println("--------");
		//for(循环使用的变量i：数组名){
		for(char ci:ary) {
			System.out.println(ci);
		}
		//
		
		String[] studentAry = new String[7];
		studentAry[0] = "luo";
		studentAry[1] = "zhou";
		studentAry[2] = "shi";
		studentAry[3] = "inn";
		studentAry[4] = "fan";
		studentAry[5] = "wei";
		studentAry[6] = "tan";
		
		System.out.println(studentAry.length);
		
		for(String bi:studentAry) {
		System.out.println(bi);
		}
		
		
		
	}

}
