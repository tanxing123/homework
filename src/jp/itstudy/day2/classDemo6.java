package jp.itstudy.day2;

public class classDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�����λ����
		 * 1.�������͡������� ������ = {
		 *                     {ֵ1��ֵ2},
		 *                     {ֵ1��ֵ2}
 * };
 * 2���������͡�������  ������  = new �������͡��г��ȡ����г��ȡ�
 * �������͡�������= ֵ
 * 
 * 3.�������
 * 
 	*/
		String[][] studentAry = {
				{"zhou","shiyao","inn"},
				{"fan","wei","tan"}
		};
		/*for(int j = 0;j < 2;j++) {
			for(int i = 0;i < 3;i++) {
				System.out.print(studentAry[j][i]+" ");
			}
			System.out.println();
		}
		*/
		//�У����M����length   x�У����M��[x-]��length
		System.out.println(studentAry.length);
		System.out.println(studentAry[0].length);
		System.out.println(studentAry[1].length);
		System.out.println(studentAry[2].length);
		for(int j = 0; j < studentAry.length;j++) {
			for(int i = 0;i < studentAry[j].length;i++) {
				System.out.print(studentAry[j][i]+" ");
			}
			System.out.println();
		}
		
		
	}

}
