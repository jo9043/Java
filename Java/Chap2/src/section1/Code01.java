package section1;

public class Code01 { // Ŭ����

	public static void main(String[] args) {
		Person1 first; // Ŭ������ �ϳ��� 'Ÿ��'�̴�.
		first = new Person1(); // object, Ŭ���� Ÿ���� ��ü�� ����
		
		// ������Ƽ�� Ÿ���� �ƴ� ��� ������ ���������̴�.
		// ���� �����Ͱ� ����� ��ü�� new ������� ���� ������ �ϰ�,
		// ���� �������� �� ��ü�� �ּҸ� �����Ѵ�.
		
		first.name = "John";
		first.number = "010-0000-0001";
		
		System.out.println("Name: " +first.name+", Number: "+first.number);
		
		Person1[] members;
		members = new Person1[100];
		
		members[0] = first;
		members[1] = new Person1();
		members[1].name = "David";
		members[1].number = "010-0000-0002";
		
		System.out.println("Name: " +members[1].name+", Number: "+members[1].number);
		
	}
}
