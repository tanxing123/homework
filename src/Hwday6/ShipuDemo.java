public class ShipuDemo {

	public static void main(String[] args) {
		
		Shipu shipu1 = new Shipu();
		shipu1.setName("大盘鸡");
		System.out.println(shipu1.getName());
		shipu1.setTime("1小时");
		System.out.println(shipu1.getTime());
		shipu1.setMethod("先闷炖，后炒");
		System.out.println(shipu1.getMethod());
		shipu1.setNumber(3);
		System.out.println(shipu1.getNumber());
		shipu1.setMaterial("鸡，土豆");
		System.out.println(shipu1.getMaterial());
		shipu1.showShiPu();
		System.out.println("------------");
		
		Shipu shipu2 = new Shipu("玉米排骨汤","1个半小时","配料炖煮",4,"排骨，玉米，胡萝卜，配料");
		shipu2.showShiPu();
	
		
		
	}

}
	
