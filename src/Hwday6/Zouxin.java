import java.util.Scanner;

public class Zhouxin {
	/*求周薪
	40小时以内，每小时50元
	40－60小时，超出部分，每小时加薪20元
	60－70小时，超出部分，每小时再加薪10元
	大于70小时，一分不给（公司不建议超负荷工作）
	要求，输入工作时长，输出周薪*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入工作时长");
		int time = scanner.nextInt();
		 testPrice(time);
		
	}
	private static void testPrice(int time) {
	
	
		double newPrice = 0.0D;
		if(time <= 40) {
			newPrice = time * 50;
		}else if(time > 40 && time <=60) {
			newPrice = (time - 40) * 70 + (40*50);
		}else if(time > 60 && time <= 70){
			newPrice = (time - 60)* 80 + (40*50) + (20*70);
		}else {
			newPrice = 0;
			System.out.println("公司不建议超负荷工作");
		}
		System.out.println("周薪:" + newPrice);
		
		
		
	}
	
	
	
}

