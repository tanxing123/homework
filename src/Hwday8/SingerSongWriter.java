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
		System.out.println(getName()+ "����"+ getGeming()+ "���ɤ��Ǥ���");

	}

	
	public void canSong() {
	System.out.println(getName()+ "����"+ getGeming() +"�褤���Ǥ���");
	
	}

}
