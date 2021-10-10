import java.util.Scanner;
public class day5HW1 {
	
	final static String[] CHINESE_ZODIAC ={"鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪"};
	final static int START_YEAR = 2020;		
	public static void main(String[] args) {
				
		
		/*生成一个12生肖数组。
		getInfo（生肖）鼠--》2020
		最近一年，
		getInfo（2020）---》牛*/
	
		
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        /*主函数先要直接调兄弟方法，下面兄弟必须static
         *
         * 
         * */
        day5HW1 Day5HW1 = new day5HW1();
        System.out.println(Day5HW1.getInfo(name));
        System.out.println("请输入年数");
      int year = Integer.valueOf(scanner.nextLine());
      System.out.println(Day5HW1.getInfo(year));
        
	}
        public int getInfo(String name) {
        	int result = 0;
        	boolean flag = false;
        	int nowYear = 2021;
        	for(int i= 0 ;i < CHINESE_ZODIAC.length;i++) {
        		if (name.equals(CHINESE_ZODIAC[i])) {
        			result = (START_YEAR + i > nowYear ?(START_YEAR + i) - 12:(START_YEAR));
        			flag = true;
        			break;
        		}
        }
		
		if(flag == false) {
			System.out.println("输入生肖有问题");
		}
		return result;
		
}

        public String getInfo(int year) {
        	
        	int index =(year > START_YEAR)?year -START_YEAR : year+12 - START_YEAR;
        		index %= 12;
        	return CHINESE_ZODIAC[index];
        }
        
        
        
        
}