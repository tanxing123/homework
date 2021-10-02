package jp.itstudy.day2;

public class Demo1 {

	public static void main(String agrs[]) {
		/*点餐
		 * 如果选择1，输出“请点餐”
		 *      2，输出“结账”
		 *      3，输出“呼叫服务员”
		 *      4，输出“加水”      
		 *      其他，输出“输入错误”
		 */
		int select = 3;
		if(select == 1) {
			System.out.println("请点餐");
		}else if(select == 2) {
			System.out.println("结账");
		}else if(select == 3) {
			System.out.println("呼叫服务员");
		}else if(select == 4) {
			System.out.println("加水");
		}else {
			System.out.println("输入错误");
		}
		
		switch(select) {
		case 1:
			System.out.println("请点餐");
		break;
		case 2:
			System.out.println("结账");
			break;
		case 3:
			System.out.println("呼叫服务员");
			break;
		case 4:
			System.out.println("加水");
			break;
		default:
			System.out.println("输入错误");
			break;
			
		}
		
	}
	
}
