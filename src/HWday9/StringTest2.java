package homework9;

public class StringTest2 {

	public static void main(String[] args) {
		//"ab22c33D5e1f1G"�ҳ��ж��ٸ������֣������a-zСд�ַ����ж�����A-Z�ַ�

		String bString = "ab22c33D5e1f1G";
		String[] ary = bString.split("(?=[A-Z])");
		System.out.println(ary.length);
		
		String[] arry = bString.split("(?=[0-9])");
		System.out.println(arry.length);
		
		String[] array = bString.split("(?=[a-z])");
		System.out.println(array.length);
		
		
		
	}

}
