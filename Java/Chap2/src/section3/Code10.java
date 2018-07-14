package section3;

/*
 * 클래스는 타입이다. 설계도 이므로 실체가 아니다
 * 따라서 클래스의 데이터 필드에 데이터를 저장할 수 없고 클레스의 멤버 메서드를 실행할 수도 없다.
 * new 명령으로 해당 클래스 타입의 객체를 만든 후 그 객체에 데이터를 저장하고 그 객체의 멤버 메서드를 실행하는 것
 * 하나의 예외가 있는데 그것이 static 멤버이다
 * static 멤버는 클래스 안에 실재로 존재하며 객체에는 존재하지 않는다.
 */

/*
 * static 멤버의 용도
 * 
 * main 메서드
 * 
 * 상수 혹은 클래스 당 하나만 유지하고 있으면 되는 값
 * 예: Math.PI, System.out
 * 
 * 순수하게 기능만으로 정의되는 메서드. 대표적인 예로는 수학 함수들
 * Math.abs(k), Math.sqrt(n), Math.min(a,b)
 * 
 */

public class Code10 {
	public static int s = 0; // 유일하게 하나만 존재
	public int t = 0; // 객체마다 존재
	
	public static void print1(){ 
		System.out.println("S = " + s);
//		System.out.println("T = " + t); // t는 nonstatic이므로 허상의 존재 (객체를 생성 후 access해야 한다)
	}
	
	public void print2(){ // print2 메서드도 허상이므로 t에 access가 가능
		System.out.println("T = " + t);
	}
	
	
	public static void main(String[] args){
/*
 * 자바에서 프로그램은 순수하게 클래스의 집합
 * main 함수조차 클래스에 포함되어야 한다 (C의 main함수는 어느 클래스에도 포함되지 않는다)
 * main이 속한 클래스의 객체를 생성할 수 없으므로 main은 반드시 static이어야 한다
 */
		s = 100;
//		t = 100; // t는 객체를 생성한 후 access가 가능하다
		print1();
//		print2();
		
		Code10 code11 = new Code10();
		code11.t = 100;
		code11.print2();
		
	}
}
