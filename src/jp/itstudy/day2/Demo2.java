package jp.itstudy.day2;

import java.util.Scanner;

public class Demo2 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
			String userName = sc.nextLine();
			String userPassword = sc.nextLine();
		//���������û�����root,������123456����ʾ�����ɹ�
		//�����string �Ƚ��Ƿ����ʱ��equalsȥ�Ƚ�
			if("root".equals(userName) && "123456".equals(userPassword)) {
				System.out.println("��½�ɹ�");
			}else {
				System.out.println("��¼ʧ��");
			}
			
			
			
	}

}
