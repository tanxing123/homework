package homework8;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone phone1 = new VoicePhone();
		Phone phone2 = new KenPhone();

		if(phone1 instanceof VoicePhone) {
			System.out.println("�������ܣ�");
			phone1.call();
			phone1.message();
			phone1.saveImg();
		}
		if(phone2 instanceof KenPhone) {
			System.out.println("���̹��ܣ�");
			phone2.call();
			phone2.message();
			phone2.saveImg();
		}
	}

}
