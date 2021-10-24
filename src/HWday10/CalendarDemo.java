import java.text.BreakIterator;
import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarDemo {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		int date = 0;
		int day = 0;
		int year = 0;
		int month = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份");
		int year1 = scanner.nextInt();
		System.out.println("请输入月份");
		int month1 = scanner.nextInt();
		System.out.println("输入的日期" + year1 + "-"+ month1);
		scanner.close();
		
		calendar.set(Calendar.YEAR, year1);
		calendar.set(Calendar.MONTH, month1);
		calendar.set(Calendar.DATE, 1);
		
		calendar.add(calendar.DATE, -1);
		int day1 = calendar.get(calendar.DATE);
		
		calendar.add(calendar.DATE, -(day1-1));
		int date1 = calendar.get(calendar.DAY_OF_WEEK)-1;
		System.out.println(calendar.getTime());
		calendar(date1,day1);
		
	}

	private static void calendar(int date1, int day1) {
		System.out.println("----------------------------------");
		System.out.print("日\t一\t二\t三\t四\t五\t六\n");
		int day = 1;
		month: for(int i = 0;i<6;i++) {
				for(int j =0;j<7;j++) {
				if(i == 0 && j<date1) {
			System.out.print("\t");
			continue;
		}
		if(day > day1) {
			System.out.println();
			break month;
		}
		System.out.print(day+ "\t");
		day++;
		}
		System.out.println();
	}
		System.out.println("----------------------------------");
	
	}
}