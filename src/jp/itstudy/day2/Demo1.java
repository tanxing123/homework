package jp.itstudy.day2;

public class Demo1 {

	public static void main(String agrs[]) {
		/*���
		 * ���ѡ��1����������͡�
		 *      2����������ˡ�
		 *      3����������з���Ա��
		 *      4���������ˮ��      
		 *      ������������������
		 */
		int select = 3;
		if(select == 1) {
			System.out.println("����");
		}else if(select == 2) {
			System.out.println("����");
		}else if(select == 3) {
			System.out.println("���з���Ա");
		}else if(select == 4) {
			System.out.println("��ˮ");
		}else {
			System.out.println("�������");
		}
		
		switch(select) {
		case 1:
			System.out.println("����");
		break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("���з���Ա");
			break;
		case 4:
			System.out.println("��ˮ");
			break;
		default:
			System.out.println("�������");
			break;
			
		}
		
	}
	
}
