package hw10;
import java.util.ArrayList;
import java.util.Random;
public class HWCardDemo {
	public static void main(String[] args) {
		Random r = new Random();
        ArrayList list = new ArrayList();
        HWCard card = new HWCard();
        String point[]=card.getPoint();
        String color[]=card.getColor();
        for (int i = 0; i <4 ; i++) { 
            for (int j = 0; j <13 ; j++) {
                list.add(color[i]+point[j]); 
            }
            
        }
        System.out.println(list);
	}
}
