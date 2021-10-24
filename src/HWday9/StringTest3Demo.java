package homework9;

import java.util.Scanner;

public class StringTest3Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请按照一下格式输入学生信息");
		String string = scanner.nextLine();
		//String string ="1:luo:18||2:wang:18||3:fan:18";
		String[] ary1 = string.split("\\|\\|");
		
		StringTest3[] strAry = new StringTest3[ary1.length];
		
		for(int i = 0;i<ary1.length;i++) {
			String[] ary2 =ary1[i].split(":");
			int idTemp = Integer.valueOf(ary2[0]);
			byte ageTemp = Byte.valueOf(ary2[2]);
			strAry[i] = new StringTest3(idTemp, ary2[1], ageTemp);
		}
			for(StringTest3 si : strAry) {
				System.out.println(si.getName());
			
		}
		
		
	}

}
