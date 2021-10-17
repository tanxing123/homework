package homework8;

public class Tennis implements InterfaceA, InterfaceB {

	private String name;
	private int num;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public Tennis(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}


	public Tennis() {
		super();
	}


	public void score() {
		System.out.println("��" + getNum() + "��ѡ��" + getName() + "�����ط���");
	}

	
	public void serve() {
		System.out.println("��" + getNum() + "��ѡ��" + getName() + "ѹ�ƶ�������ǰ���÷�");

	}

}
