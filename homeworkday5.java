package co.jp.itstudy.homework20210925.day3;

import java.util.Scanner;

public class homeworkday5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1����ɨ����������һ���ַ���
		�����[a-Z]ֱ�Ӿ�������ַ����������������ַ�������ĸ��*/
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("�������ַ�");
		char varC = scanner1.next().charAt(0);
		boolean flag1 = 'a' <= varC && 'z' >= varC;
		boolean flag2 = 'A' <= varC && 'Z' >= varC;
		
		
	/*	
		2����׼���ؼ��㣺
		�У���ߣ�cm��- 105 = ��׼����(kg)
		Ů����ߣ�cm��- 100 = ��׼����(kg)
		Ҫ�������Ա���ߡ�����
		��������xx������xx����׼����xx
		
		System.out.println("ݔ���Ԅe");
		Scanner scanner = new Scanner(System.in);
		String gender = scanner.next();
		System.out.println("�Ԅe:" + gender);
		System.out.println("ݔ�����");
		int height = scanner.nextInt();
		System.out.println("���:" + height);
		System.out.println("ݔ������");
		int weight = scanner.nextInt();
		System.out.println("����:" + weight);
		if(gender.equals("��")){
			System.out.println("�˜�����:" + (height-105));
		}else {
			System.out.println("�˜�����:" + (height-100));
		}
		*/
		
		
		
		
	/*	3���ڵ���������ϡ�����һ����Ϊ���顣
		���ձ���Ӧ�Ķ��ء�
		����ɨ����������һ��������ӡ���ö�����������
		eg��
		���롰��������
		���"ǧ��������̨������������"*/
		
		String[][] cities = {
                {"������", "�N�u��", "�����"},
                {"������", "�͹���", "ާ��"},
                {"������", "�����"},
                {"������", "�˻���"},
                {"�Ͼ���", "�¾���", "��Ҋ��"},
        };
        String[] prefectures = {"�|����", "����h", "���δ�", "���渮", "������"};

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();//���붼������
        //���ѭ���������أ���ΪҪ����ȷ����������ĸ��������أ�ѭ��������Ϊ�����������鳤��
        for (int i = 0; i < prefectures.length; i++) {
            //�ڲ�ѭ�� ����������������µ����У�
            // ���i=0ʱ���ڲ����鳤��Ϊ����cities[0]�ĳ��ȣ�
            // ��{"������", "�N�u��", "�����"}�ĳ��ȣ��Դ�����
            for (int j = 0; j < cities[i].length; j++) {
                if(input.equals(prefectures[i])){
                    System.out.println(cities[i][j]);
                }

            }

        }
		
		
		
		
		
		
		/*4,����һ��һλ���顣����12��Ф��
		������
		������������
		eg��2021��,ţ��*/
        String[] shengxiao = {"��", "ţ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��"};
        Scanner scanner3 = new Scanner(System.in);
        int year = scanner.nextInt();

        int index = year % 12 - 4;

        System.out.println(shengxiao[index]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
