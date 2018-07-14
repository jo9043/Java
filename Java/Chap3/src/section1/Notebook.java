package section1;


// Computer�� �Ӽ��� ���� �޴´�
public class Notebook extends Computer {
	private double screenSize;
	private double weight;
	
	/*
	 * ��Ӱ� ������
	 * 
	 * �����ڰ� ���� ��� �ڵ����� no-parameter �����ڰ� ���������. 
	 * ��� ���� Ŭ������ �����ڴ� ���� ����Ŭ������ �����ڸ� ȣ���Ѵ�
	 * 1. super(...)�� ���� ���������� ȣ�����ְų�
	 * 2. �׷��� ���� ��쿡�� �ڵ����� no-parameter �����ڰ� ȣ��ȴ�
	 * 
	 * ����Ŭ������ no-parameter �����ڰ� ���µ� ����Ķ������ �����ڿ��� super(...) ȣ���� �����ִ� ���
	 * 
	 */

	public Notebook(String man, String proc, int ram, int disk, double speed, double screen, double weight){
		//super(...)�� ���������� ������ ���� Ŭ������ no-parameter �����ڸ� ȣ���Ѵ�.
		super(man, proc, ram, disk, speed);
		screenSize = screen;
		this.weight = weight;
	}
	
	// Method Overriding
	// ��� ���� �޼��带 ����Ἥ ������
	public String toString(){
		String result = super.toString() + // �θ� Ŭ������ toString �Լ��� ȣ��
						"\nScreen Size: " + screenSize +
						"\nWeight: " + weight;
		return result;
	}
}

/*
 * ������ (Polymorphism)
 * ����Ŭ���� Ÿ���� ������ ����Ŭ���� Ÿ���� ��ü�� ������ �� �ִ�.
 * 
 * Computer theComputer = new Notebook(....);
 * Computer Ÿ���� ���� theComputer�� Notebook Ÿ���� ��ü�� ����
 * 
 * System.out.println(theComputer.toString());
 */



