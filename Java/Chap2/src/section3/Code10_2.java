package section3;

public class Code10_2 {
	public static void main(String[] args){
		Code10 test = new Code10();
		test.t = 100;
		test.print2();
		
		test.s = 10; // �ùٸ� ǥ���� �ƴϴ�.
		Code10.s = 10; // ��ü�� �ƴ� Ŭ�������� access�ϴ� ���� �ùٸ� ǥ��
		test.print1();
		Code10.print1();
		
		Code10 test2 = new Code10();
		test2.print2();
		test2.print1(); // test1�� s�� test2�� s�� ������ ��
	}
}