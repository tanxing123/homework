package homework9;


public class StringTest3 {

	
		/*�Ӷ���һ��ѧ���ࣨid��name��age��
		ɨ��������һ���ַ�"1:luo:18||2:wang:18||3:fan:18";
		��3���˵���ϢתΪ����ѧ�����󣨿���ѧ��������չ��*/
		
		private String name;
		private int id;
		private byte age;
		public StringTest3(int i, String string, int j, StringTest3 stringTest3) {
			super();
		}
		public StringTest3(int id, String name, byte age) {
			super();
			this.name = name;
			this.id = id;
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public byte getAge() {
			return age;
		}
		public void setAge(byte age) {
			this.age = age;
		}
		

		
		
		
		
	

}
