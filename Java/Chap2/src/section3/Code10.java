package section3;

/*
 * Ŭ������ Ÿ���̴�. ���赵 �̹Ƿ� ��ü�� �ƴϴ�
 * ���� Ŭ������ ������ �ʵ忡 �����͸� ������ �� ���� Ŭ������ ��� �޼��带 ������ ���� ����.
 * new �������� �ش� Ŭ���� Ÿ���� ��ü�� ���� �� �� ��ü�� �����͸� �����ϰ� �� ��ü�� ��� �޼��带 �����ϴ� ��
 * �ϳ��� ���ܰ� �ִµ� �װ��� static ����̴�
 * static ����� Ŭ���� �ȿ� ����� �����ϸ� ��ü���� �������� �ʴ´�.
 */

/*
 * static ����� �뵵
 * 
 * main �޼���
 * 
 * ��� Ȥ�� Ŭ���� �� �ϳ��� �����ϰ� ������ �Ǵ� ��
 * ��: Math.PI, System.out
 * 
 * �����ϰ� ��ɸ����� ���ǵǴ� �޼���. ��ǥ���� ���δ� ���� �Լ���
 * Math.abs(k), Math.sqrt(n), Math.min(a,b)
 * 
 */

public class Code10 {
	public static int s = 0; // �����ϰ� �ϳ��� ����
	public int t = 0; // ��ü���� ����
	
	public static void print1(){ 
		System.out.println("S = " + s);
//		System.out.println("T = " + t); // t�� nonstatic�̹Ƿ� ����� ���� (��ü�� ���� �� access�ؾ� �Ѵ�)
	}
	
	public void print2(){ // print2 �޼��嵵 ����̹Ƿ� t�� access�� ����
		System.out.println("T = " + t);
	}
	
	
	public static void main(String[] args){
/*
 * �ڹٿ��� ���α׷��� �����ϰ� Ŭ������ ����
 * main �Լ����� Ŭ������ ���ԵǾ�� �Ѵ� (C�� main�Լ��� ��� Ŭ�������� ���Ե��� �ʴ´�)
 * main�� ���� Ŭ������ ��ü�� ������ �� �����Ƿ� main�� �ݵ�� static�̾�� �Ѵ�
 */
		s = 100;
//		t = 100; // t�� ��ü�� ������ �� access�� �����ϴ�
		print1();
//		print2();
		
		Code10 code11 = new Code10();
		code11.t = 100;
		code11.print2();
		
	}
}