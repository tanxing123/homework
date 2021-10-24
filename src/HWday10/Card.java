package hw10;

public class Card {

	private int number;
	private int color;
	private String showN;
	private String showC;
	public Card(int number, int color) {
		super();
		this.number = number;
		this.color = color;
		
		if(number<=10) {
			this.showN = number + "";
		}else {
			switch (number) {
			case 11:
				this.showN = "J";
				break;
			case 12:
				this.showN = "Q";
				break;
			case 13:
				this.showN = "K";
				break;
			case 14:
				this.showN = "A";
				break;
			}
		}
			switch(color) {
			case 0:
				this.showC = "方块";
				break;
			case 1:
				this.showC = "梅花";
				break;
			case 2:
				this.showC = "红心";
				break;
			case 3:
				this.showC = "黑桃";
				break;
			}
		
		
		
	}
	public Card() {
		super();
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
	public String toString() {
		return showC +showN;
	}
	
	
	
}
