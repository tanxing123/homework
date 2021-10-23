package homework9;


public class StringTest3 {

	
		/*从定义一个学生类（id，name，age）
		扫描器输入一下字符"1:luo:18||2:wang:18||3:fan:18";
		把3个人的信息转为三个学生对象（可以学生数组扩展）*/
		
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
