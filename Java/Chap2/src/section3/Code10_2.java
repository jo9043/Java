package section3;

public class Code10_2 {
	public static void main(String[] args){
		Code10 test = new Code10();
		test.t = 100;
		test.print2();
		
		test.s = 10; // 올바른 표현은 아니다.
		Code10.s = 10; // 객체가 아닌 클래스에서 access하는 것이 올바른 표현
		test.print1();
		Code10.print1();
		
		Code10 test2 = new Code10();
		test2.print2();
		test2.print1(); // test1의 s와 test2의 s는 동일한 것
	}
}
