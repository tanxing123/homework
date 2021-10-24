package hw10;

import java.util.ArrayList;
import java.util.List;

 public class CardsDemo {
	 public static List<Card> Poker() {
		ArrayList<Card> list = new ArrayList<Card>();
		  for(int i =0;i < 4;i++) {
			for(int j =0 ;j<15;j++) {
				list.add(new Card(j,i));
			}
		}
		return list;
		
	 }
	 public static void main(String[] args) {
		 List<Card> poker = Poker();
		 System.out.println(poker);
		
	 }
	 
	 
	 
	 
}
