package Hwday8;
import java.util.Random;

public class Shuzi {

	public static void main(String[] args) {
		
		Random x= new Random();
		int i;
		for(i=0;i <10;i++) {
		int number = x.nextInt(101);
			System.out.println(number);
		
		}
	}
}