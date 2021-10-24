package homework9;

public class StringTest2 {

	public static void main(String[] args) {
		//"ab22c33D5e1f1G"找出有多少个是数字，多个是a-z小写字符，有多少是A-Z字符

		String String = "ab22c33D5e1f1G";
		/*String[] ary = String.split("(?=[A-Z])");
		System.out.println(ary.length);
		
		String[] arry = String.split("(?=[0-9])");
		System.out.println(arry.length);
		
		String[] array = String.split("(?=[a-z])");
		System.out.println(array.length);*/
		
		char[] ary = String.toCharArray();
		int numCount = 0;
		int uppercseCount = 0;
		int lowercaseCount = 0;
		for(int i = 0;i<ary.length;i++) {
			if(ary[i] >= '0' && ary[i]<= '9') {
				numCount++;
		}else if(ary[i] >= 'A' && ary[i]<= 'Z') {
				uppercseCount++;
		}else if(ary[i] >= 'a' && ary[i]<= 'z') {
				lowercaseCount++;
	}
		System.out.println("数字0:"+numCount);
		System.out.println("大写字母:"+uppercseCount);
		System.out.println("小写字母:"+lowercaseCount);
		}
}
}