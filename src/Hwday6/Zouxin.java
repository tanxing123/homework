import java.util.Scanner;

public class Zouxin {
	/*求周薪
	40小时以内，每小时50元
	40－60小时，超出部分，每小时加薪20元
	60－70小时，超出部分，每小时再加薪10元
	大于70小时，一分不给（公司不建议超负荷工作）
	要求，输入工作时长，输出周薪*/

	final static double Hourywage = 50.0D;
	private static double hours;
	private static double newsalary;


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入工作时长");
		double hours = scanner.nextDouble();
		double newsalary = getSalary(hours);
		System.out.println("你的周薪:" + Zouxin.getSalary(hours));
		
		
	}
	private static double getSalary(double hours) {
		boolean flg = hours >70;
		if(flg){
			return newsalary = hours * Hourywage;
		}else if(hours <= 40){
newsalary = hours * Hourywage;
		}else if(hours > 40 && hours <= 60){
			newsalary = (40*Hourywage) + (hours - 40)*(Hourywage + 20.0);
		}else if(hours > 60 && hours <=70){
			newsalary = (40*Hourywage) + (20*(Hourywage + 20.0)) + (hours - 60)*(Hourywage + 20.0 +10.0);
		}else{
			newsalary = (40*Hourywage) + 20*70 + 10*80;
		}
		return newsalary;
		
		
	}
	
	
	
}

