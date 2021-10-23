package homework9;

public class StringTest2 {

	public static void main(String[] args) {
		//"ab22c33D5e1f1G"找出有多少个是数字，多个是a-z小写字符，有多少是A-Z字符

		String bString = "ab22c33D5e1f1G";
		String[] ary = bString.split("(?=[A-Z])");
		System.out.println(ary.length);
		
		String[] arry = bString.split("(?=[0-9])");
		System.out.println(arry.length);
		
		String[] array = bString.split("(?=[a-z])");
		System.out.println(array.length);
		
		
		
	}

}
