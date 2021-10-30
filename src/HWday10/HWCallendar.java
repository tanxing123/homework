package hw10;



	import java.util.Calendar;
	import java.util.Scanner;

	public class HWCallendar {

		public static void main(String[] args) {
			System.out.println("���������ڣ���2021-10-24����");
			Scanner scanner=new Scanner(System.in);
			String today= scanner.nextLine();
			//�����յ����ַ���ת�����ڲ�����
			Calendar calendar=Calendar.getInstance();
			String yearIn=today.substring(0,3);
			String monthIn=today.substring(5, 6);
			int year=Integer.parseInt(yearIn);
			int month=Integer.parseInt(monthIn);
			 
			int date = 0; // �����������º����õ���1�ŵ�����
			int day_max = 0;// �����������µ��µ�����
			
			// ���·���Ϊ����1��,��ǰһ��,�ȵõ���ǰ���ж�����
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, month);
			calendar.set(Calendar.DATE, 1);
			
			calendar.add(Calendar.DATE, -1);
			day_max = calendar.get(Calendar.DATE);
			
			// �ٽ�ʱ������Ϊ1��,�����ڼ�,��������0,����һ��1,��������
			calendar.add(Calendar.DATE, -(day_max - 1));
			date = calendar.get(Calendar.DAY_OF_WEEK) - 1;
			
			System.out.println(calendar.getTime());
			printfCalendar(date, day_max);
		}
		
		/**
		 * ���ܣ���ӡһ������
		 * @param start		����1�������ڼ�
		 * @param day_max	�����ж�����
		 */
		public static void printfCalendar(int start, int day_max) {
			System.out.println("==============================");
			// �����ͷ
			System.out.print("��\tһ\t��\t��\t��\t��\t��\n");
			
			int day = 1;// ��ӡ������
			month: for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					// ��ӡ��һ�е�ʱ�򣬿ճ�ǰstart���ռ�
					if (i == 0 && j < start) {
						System.out.print("\t");
						// ������ǰ��ѭ��
						continue;
					}
					
					if (day > day_max) {
						System.out.println();
						break month;
					}
					System.out.print(day + "\t");
					day++;
				}
				// ��ӡ��һ�к���
				System.out.println();
			} // for month
			System.out.println("==============================");
		}
	}

