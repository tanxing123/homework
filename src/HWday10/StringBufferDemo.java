package hw10;

public class StringBufferDemo {

	public static void main(String[] args) {
		/*(1)StringBufferオブジェクトhelloworldの伏撹を佩います。
		(2)printlnメソッドでhelloworldオブジェクトのlengthメソッド?g佩?rの?､魃輅召靴泙后?
		(3)printlnメソッドでhelloworldオブジェクトのcapacityメソッド?g佩?rの?､魃輅召靴泙?
		(４)deleteメソッドでキ?`ワ?`ド仝ｈ々の??茅を佩います。
		(3)appendメソッドでキ?`ワ?`ド仝aaaa々の弖紗を佩います。
		(4)replaceメソッドでhelloworldbbbの燕幣を佩います。*/

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
