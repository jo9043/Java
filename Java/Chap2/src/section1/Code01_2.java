package section1;

public class Code01_2 { // Ŭ����
	public static void main(String[] args) {
		Person1 first; // Ŭ������ �ϳ��� 'Ÿ��'�̴�.
		first = new Person1(); // object, Ŭ���� Ÿ���� ��ü�� ����
		
		// ������Ƽ�� Ÿ���� �ƴ� ��� ������ ���������̴�.
		// ���� �����Ͱ� ����� ��ü�� new �������� ���� ������ �ϰ�,
		// ���� �������� �� ��ü�� �ּҸ� �����Ѵ�.
		// ���� ���� ȣ��� �迭�� �Ű������� �Ͽ��� �� �迭�� �������� �̹Ƿ�
		// �Լ� �ȿ��� �����͸� �����ص� ���� �����Ϳ� ����ȴ�.
		
		first.name = "John";
		first.number = "010-0000-0001";
		
		// System.out.println("Name: " +first.name+", Number: "+first.number);
		
		Person1 second = first; // ���� Second�� First�� ������ ��ü�� ����
		second.name = "Tom";
		
		// System.out.println("Name: " +first.name+", Number: "+first.number);
		
		Person1[] members;
		members = new Person1[100];
		members[0] = first;
		members[1] = second;
		
		// members[2].name = "David"; // �ƹ��� ��ü�� �����ϰ� ���� �����Ƿ� ������ �߻��Ѵ�.
		// members[2] = new Person();
		
		System.out.println("Name: " +members[0].name+", Number: "+members[0].number);
		System.out.println("Name: " +members[1].name+", Number: "+members[1].number);
	}
}