package section1;

public class Code01 { // 출력
	static int num; //함수 외부에 선언하면 static
	
	public static void main(String[] args){
		int anotherNum = 5;
		
		num = 2;
		
		System.out.println(num + anotherNum); //덧셈
		System.out.println("Num " + num); //문자열 접합
		System.out.println("AnotherNum " + anotherNum);
		System.out.println("Sum " + num + anotherNum); //left associativity
		System.out.println("Sum " + (num + anotherNum)); 
	}

}
