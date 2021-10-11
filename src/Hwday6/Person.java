public class Person {

	/*Person写一个人类和执行类（一个自己对象和自己最喜欢的人对象）
	睡觉方法体打印xx在睡觉，吃饭方法：xxx在吃饭
	姓名，年龄，性别，星座，电话属性都需要封装，写空构造器和全参数的一个构造器*/ 

		private String name;
		private int age;
		private byte gander;
		private String star;
		private long phone;
		
		public void setName(String name) {
			this.name = name;
		}
			public String getName() {
			return this.name;
			}	
		public void setAge(Integer age) {
				this.age = age;
			}
			public int getAge() {
				return this.age;
			}	
		public void setGander(String gander) {
			this.gander = (byte)("男".equals(gander)?1:2);
				}
			public String getGander() {
				return this.gander == 1?"男":"女";
			}
		public void setStar(String star) {
						this.star = star;
					}
				public String getStar() {
						return this.star;
				}
	
		public void setPhone(long phone) {
					this.phone = phone;
				}
			public String getPhone() {
					String resultString = phone /10000 +"****";
					return resultString;
			}

			public Person() {	
			}
			
			public Person(String name, int age, byte gander, String star, long phone) {
				this.name = name;
				this.age = age;
				this.gander = gander;
				this.star = star;
				this.phone = phone;
			}
		public void Issleeping() {
			System.out.println(name + "在睡觉");
		}
		public void Iseating() {
			System.out.println(name + "在吃饭");
		}
		public void showInfo() {
			System.out.println("名字:" + getName());
			System.out.println("体重:" + getAge());
			System.out.println("颜色:" + getGander());
			System.out.println("喜爱食物:" + getStar());
			System.out.println("有无腹带:" + getPhone());
			
		}
	
	
	
	
	
	
	

}