package hw10;

public class StringBufferDemo {

	public static void main(String[] args) {
		/*(1)StringBuffer���֥�������helloworld�����ɤ��Ф��ޤ���
		(2)println�᥽�åɤ�helloworld���֥������Ȥ�length�᥽�åɌg�Еr�΂����ʾ���ޤ���
		(3)println�᥽�åɤ�helloworld���֥������Ȥ�capacity�᥽�åɌg�Еr�΂����ʾ���ޤ�
		(��)delete�᥽�åɤǥ��`��`�ɡ��衹���������Ф��ޤ���
		(3)append�᥽�åɤǥ��`��`�ɡ�aaaa����׷�Ӥ��Ф��ޤ���
		(4)replace�᥽�åɤ�helloworldbbb�α�ʾ���Ф��ޤ���*/

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
