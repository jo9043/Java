package section1;

public class Code01 { // ���
	static int num; //�Լ� �ܺο� �����ϸ� static
	
	public static void main(String[] args){
		int anotherNum = 5;
		
		num = 2;
		
		System.out.println(num + anotherNum); //����
		System.out.println("Num " + num); //���ڿ� ����
		System.out.println("AnotherNum " + anotherNum);
		System.out.println("Sum " + num + anotherNum); //left associativity
		System.out.println("Sum " + (num + anotherNum)); 
	}

}
