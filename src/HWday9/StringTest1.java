
public static void main(String[] args) {
		/*从扫描器输入一个字符(str1),再输入一个字符（str2）
		做异常判断：
		str1和str2是否为空（null，""）则报null指针异常
		str1和str2转为int，如果有字符转不了则报数字转化异常
		Str2如果为0时，则报数学异常
		如果其他报错则打印e.toString
		如果计算出的结果等于则主动抛定义的一个异常（“结果不能为1”）
		*/
		String str1 = "abc";
		String str2 ="";
		System.out.println(str1.length());
		System.out.println(str2.length());
		if(str1.length() == 0) {
			System.out.println("str1:指针异常");
		}else if(str2.length()== 0){
			System.out.println("str2:指针异常");
		}
		
		String str3 = "bbb";
		String str4 = "30";
		try {
		int a = Integer.valueOf(str3);
		System.out.println(str3);
		}catch(Exception e) {
			System.out.println("数字转化异常");
		}
		
		if(str4.equals(0)) {
			System.out.println("数学异常");
		}else {
			System.out.println(str4);
		}
		String str5 = "汉字";
		try {
			int b = Integer.valueOf(str5);
			System.out.println(str5);
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		int str6 = 30;
		if(str6 <60) {
			try {
				throw new Exception();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}
