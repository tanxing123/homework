package hw10;



	import java.util.Calendar;
	import java.util.Scanner;

	public class HWCallendar {

		public static void main(String[] args) {
			System.out.println("请输入日期（如2021-10-24）：");
			Scanner scanner=new Scanner(System.in);
			String today= scanner.nextLine();
			//将接收到的字符串转成日期并设置
			Calendar calendar=Calendar.getInstance();
			String yearIn=today.substring(0,3);
			String monthIn=today.substring(5, 6);
			int year=Integer.parseInt(yearIn);
			int month=Integer.parseInt(monthIn);
			 
			int date = 0; // 存放输入的年月后计算得到的1号的星期
			int day_max = 0;// 存放输入的年月的月的天数
			
			// 将月份置为下月1号,往前一天,先得到当前月有多少天
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, month);
			calendar.set(Calendar.DATE, 1);
			
			calendar.add(Calendar.DATE, -1);
			day_max = calendar.get(Calendar.DATE);
			
			// 再将时间设置为1号,是星期几,星期日是0,星期一是1,依次类推
			calendar.add(Calendar.DATE, -(day_max - 1));
			date = calendar.get(Calendar.DAY_OF_WEEK) - 1;
			
			System.out.println(calendar.getTime());
			printfCalendar(date, day_max);
		}
		
		/**
		 * 功能：打印一个日历
		 * @param start		该月1号是星期几
		 * @param day_max	该月有多少天
		 */
		public static void printfCalendar(int start, int day_max) {
			System.out.println("==============================");
			// 输出表头
			System.out.print("日\t一\t二\t三\t四\t五\t六\n");
			
			int day = 1;// 打印的天数
			month: for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					// 打印第一行的时候，空出前start个空间
					if (i == 0 && j < start) {
						System.out.print("\t");
						// 跳出当前次循环
						continue;
					}
					
					if (day > day_max) {
						System.out.println();
						break month;
					}
					System.out.print(day + "\t");
					day++;
				}
				// 打印完一行后换行
				System.out.println();
			} // for month
			System.out.println("==============================");
		}
	}

