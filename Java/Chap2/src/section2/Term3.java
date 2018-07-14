package section2;

/* 
 * ������
 * 
 * Ŭ���� �ȿ� �� Ŭ������ ������ �̸��� ������ return Ÿ���� ���� Ư���� �޼���
 * new �������� ��ü�� ������ �� �ڵ����� ����ȴ�.
 * ��ü�� ������ �ʵ��� ���� �ʱ�ȭ �ϴ� ���� �� ����.
 */

public class Term3 {
	int coef;
	int expo;
	
	public Term3(int c, int e){
		coef = c;
		expo = e;
	}
	
	public int calcTerm(int x){
		return (int)(coef * Math.pow(x, expo));
	}
	
	public void printTerm(){
		System.out.println(coef + "x^" + expo);
	}
}