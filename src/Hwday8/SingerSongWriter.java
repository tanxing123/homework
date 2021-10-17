package homework8;

public class SingerSongWriter implements Songer, SongWriter {

	private String name;
	private String geming;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGeming() {
		return geming;
	}


	public void setGeming(String geming) {
		this.geming = geming;
	}


	public SingerSongWriter(String name, String geming) {
		super();
		this.name = name;
		this.geming = geming;
	}


	public SingerSongWriter() {
		super();
	}


	public void canDance() {
		System.out.println(getName()+ "梧返"+ getGeming()+ "おどりをできる");

	}

	
	public void canSong() {
	System.out.println(getName()+ "梧返"+ getGeming() +"梧いができる");
	
	}

}
