package section2;

public class Term2 {
	int coef;
	int expo;
	
	public int calcTerm(int x){
		return (int)(coef * Math.pow(x, expo));
	}
	
	public void printTerm(){
		System.out.println(coef + "x^" + expo);
	}
}

/*
 * Term2 t = new Term2();
 * t.coef = 3;
 * t.expo = 2;
 * int result = t.calcTerm(2);
 * t.printTerm();
 * 
 * Term2�� ���赵 �� ��.
 * Ŭ������ �ƴ� ������ ��ü �ȿ� �ִ� �޼������ ���� �ϴ� ��. (Ŭ���� ���� �޼������ ���)
 * ������ ��ü �ȿ� calcTerm�� printTerm �޼��尡 ����.
 * �����͸�� �Ӹ� �ƴ϶� ������ �޼���鵵 ��ü���� ���� ����.
 */

/*
 * ��ü��: ������ + �޼���
 * �����ʹ� ��ü�� ���� �Ӽ��� ǥ��, �޼���� ��ü�� ���(���� �Ӽ�)�� ǥ��
 * 
 */


