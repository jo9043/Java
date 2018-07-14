package section1;

/*
 * IS-A ����
 * A Notebook is a Computer
 * Computer is the superclass of Notebook
 * Notebook is a subclass of Computer
 */

public class Code01 { // ���
	
	public void run(){
		Notebook nb = new Notebook("Dell", "15", 4, 1000, 1.2, 15.6, 1.5);
		System.out.println(nb.computerPower());
		System.out.println(nb.toString());
		
		Computer cp = new Notebook("Samsung", "15", 4, 1000, 1.2, 15.6, 1.5);
//		Notebook test3 = new Computer("LG", "15", 4, 1000, 1.2, 15.6, 1.5);
//		���� �������� �ʴ´�.
		
		System.out.println(cp.toString()); // static binding vs. dynamic binding
//		�ڹٿ����� �׻� �������ε��� �Ͼ��. 
//		(cp�� Ÿ���� computer���� ���� �����ϰ� �ִ� ��ü�� Notebook�̹Ƿ� Notebook�� toString()�� ȣ��ȴ�.
	}
	
	public static void main(String[] args){
		Code01 test = new Code01();
		test.run();
	}

}