package hw10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Http {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个字符(https://www.abc.jpg)");
		String url = scanner.nextLine();
		
		
		if(url.equals("https")) {
			Object url1 = url.replace("https", "http");
			System.out.println(url1);
		}else{
			System.out.println("url不是加密网址");
		}
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(url);
		
		System.out.println(stringBuffer.indexOf(".jpg"));
		System.out.println(stringBuffer.indexOf(".gif"));
		System.out.println(stringBuffer.indexOf(".png"));
		
		StringBuffer t1 = stringBuffer.delete(0, stringBuffer.indexOf(".jpg"));
		StringBuffer t2 = stringBuffer.delete(0, stringBuffer.indexOf(".gif"));
		StringBuffer t3 = stringBuffer.delete(0, stringBuffer.indexOf(".png"));
		
		try {
			Integer a = stringBuffer.indexOf(".jpg");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("不含jpg");
		}
		try {
			Integer a = stringBuffer.indexOf(".gif");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("不含gif");	
		}
		try {
			Integer a = stringBuffer.indexOf(".png");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("不含png");	
		}
		Collection<String> collection = new ArrayList<>();
		collection.add(url);
		if(collection.contains(t1)) {
			System.out.println(t1);
		}else if(collection.contains(t2)) {
			System.out.println(t2);
		}else if(collection.contains(t3)) {
			System.out.println(t3);
		}else {
			System.out.println("不是图片");
		}
		
		
		
	}

}
