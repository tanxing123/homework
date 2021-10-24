package hw10;

public class StringBufferDemo {

	public static void main(String[] args) {
		/*(1)StringBufferオブジェクトhelloworldの生成を行います。
		(2)printlnメソッドでhelloworldオブジェクトのlengthメソッド実行時の値を表示します。
		(3)printlnメソッドでhelloworldオブジェクトのcapacityメソッド実行時の値を表示します
		(４)deleteメソッドでキーワード「ｈ」の削除を行います。
		(3)appendメソッドでキーワード「aaaa」の追加を行います。
		(4)replaceメソッドでhelloworldbbbの表示を行います。*/

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("helloword");
		System.out.println(stringBuffer.length()-1);
		
		System.out.println(stringBuffer.capacity());
		
		stringBuffer.deleteCharAt(0);
		System.out.println(stringBuffer);
		
		stringBuffer.append("aaaa");
		System.out.println(stringBuffer);
		
		System.out.println(stringBuffer.replace(0,stringBuffer.length(),"helloworddbbb"));
		
		
		
		
		
	}

}
