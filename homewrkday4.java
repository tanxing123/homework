package co.jp.itstudy.homework20210925.day3;

import java.util.Scanner;

public class homewrkday4 {

	public static void main(String[] args) {
		
		//��һ�⡣������
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<(5-i);j++) {
				System.out.print(" ");
			}
			for(int j = 0;j<i*2+1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		/*�ڶ���
		 * ��aba
		 * 100--999
		 * 101,212
		 */
		int a = 100;
		do {
			if((a/100) == (a%10) && ((a/10)%10) != (a/100)) {
				System.out.println(a);
			}
			a++;
		}while(a < 999);
		
		
		/*������
		 * ����ֵ��
		 * ===�����ֵ
		 * ֱ�����������ֵ"exit"
		 * eg��
		 * abc
		 * ===��abc
		 * aaaa
		 * ===��aaaa
		 * bbb
		 * ===��bbb
		 *exit
		 *game over
		 *������� 
		  */
		/*Scanner scanner = new Scanner(System.in);
		String nam = scanner.next();
		if("exit".equals(nam)){
			System.out.println("game over");
		}
		System.out.println(nam);*/

	
		/*������
		 * ����һ�����飬��������
		 * ������--����Ҷԭ
		 * ͨ��ɨ��������Ŀ�ĵأ���Ҷԭ
		 * ���������--����ҶԭҪ����վ
		 * ���� ������ľ��ǧ�j���ȡ��ŝ���Ĺȡ��Х��ȡ�����ˮ���������ˮ�����~ԭ
		 * 
		 */
		String[] eKi = new String[10];
		 	eKi[0] ="����";
		 	eKi[1] ="����ľ";
		 	eKi[2] ="ǧ�j����";
		 	eKi[3] ="�ŝ��";
		 	eKi[4] ="�Ĺ�";
		 	eKi[5] ="�Х���";
		 	eKi[6] ="����";
		 	eKi[7] ="ˮ����";
		 	eKi[8] ="�����ˮ";
		 	eKi[9] ="���~ԭ";
		 	for(int i = 0;i < 10;i++) {
		 	if(eKi[i]=="���~ԭ") {
				System.out.println(i);
			} 	
		 }		
		
		
		/*������
		 * int[] studentLunckNum = {4,15,7,8,9,6,5,19}
		 * max =4
		 * �ҵ����ֵ����Сֵ����ƽ��ֵ
		 */
		 	int[] studentLunckNum = {4,15,7,8,9,6,5,19};
		 	for(int k = 0; k <8;k++) {
		 	if(studentLunckNum[k] > studentLunckNum[k+1]) {
		 			System.out.println(studentLunckNum[k]);
		 		}else {
		 			System.out.println(studentLunckNum[k+1]);
		 		}	
		 	}
		 		
		
		
		
		
		
		
		
		
		/*��6��
		 * �����λ����
		 * �ձ�������
		 * {
			{"̨�|��","ǧ������","����","������"},
			{"������","ǧ�~��"}
			��������
			}
			��������
		 */
		 	String[][] riBen = {
					{"̨�|��","ǧ������","����","������"},
					{"������","ǧ�~��"},
					{"�ɑ���"}
		 			};
		 		for(int j = 0 ; j < riBen.length; j++) {
		 			for(int i = 0;i < riBen[j].length;i++) {
					System.out.print(riBen[j][i]+"        ");
		 			}
		 			System.out.println();
		 		}
		
		
		
		
	}

}

