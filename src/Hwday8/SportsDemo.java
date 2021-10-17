package homework8;

public class SportsDemo {

	public static void main(String[] args) {
		Tennis tennis = new Tennis("ÀîÄÈ",8);
		tennis.score();
		tennis.serve();
		System.out.println("===========");

		Football football = new Football("Ð¡ÂÞ",11);
		football.score();
		football.serve();
	}

}
