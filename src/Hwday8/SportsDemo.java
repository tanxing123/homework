package homework8;

public class SportsDemo {

	public static void main(String[] args) {
		Tennis tennis = new Tennis("����",8);
		tennis.score();
		tennis.serve();
		System.out.println("===========");

		Football football = new Football("С��",11);
		football.score();
		football.serve();
	}

}
