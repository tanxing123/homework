package homework8;

import java.util.Random;

public class Chouqian {

	public static void main(String[] args) {
		
		Random x = new Random();
		int i;
		for(i=0;i <1;i++) {
		int number = x.nextInt(5) + 1;
			System.out.println(number);
			if(number ==1) {
				System.out.println("´ó¼ª");
			}else if(number == 2) {
				System.out.println("¼ª");
			}else if(number == 3) {
				System.out.println("Ð¡¼ª");
			}else if(number == 4) {
				System.out.println("Ð×");
			}else {
				System.out.println("´óÐ×");
			}
	}

		
		
		
}
}