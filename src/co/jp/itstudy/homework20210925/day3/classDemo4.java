package co.jp.itstudy.homework20210925.day3;

public class classDemo4 {

	public static void main(String[] args) {
		/*
		 * break  ֹͣѭ��
		 * continue �����˴�ѭ��,����ѭ��
		 */
		for(int i = 1; i < 8;i++) {
			if(i ==6) {
				System.out.println("�����첻�ܲ�");
				//continue;
				break;
			}
			System.out.println("��"+i+"�����ܲ�");
		}
		
		c: for(int a =1;a <6;a++) {
			d: for(int b =1;b <6;b++) {
				/*if(b ==3){
					break;
				}*/
		System.out.print("��:"+a+"��:"+b);
			}
		System.out.println();
		}
	}
}
