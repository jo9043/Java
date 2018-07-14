package section1;

public class Code01_2 { // 클래스
	public static void main(String[] args) {
		Person1 first; // 클래스는 하나의 '타입'이다.
		first = new Person1(); // object, 클래스 타입의 객체를 생성
		
		// 프리미티브 타입이 아닌 모든 변수는 참조변수이다.
		// 실제 데이터가 저장될 객체는 new 명령으로 따로 만들어야 하고,
		// 참조 변수에는 그 객체의 주소를 저장한다.
		// 값에 의한 호출시 배열을 매개변수로 하였을 때 배열은 참조변수 이므로
		// 함수 안에서 데이터를 변경해도 원본 데이터에 적용된다.
		
		first.name = "John";
		first.number = "010-0000-0001";
		
		// System.out.println("Name: " +first.name+", Number: "+first.number);
		
		Person1 second = first; // 변수 Second도 First와 동일한 객체를 참조
		second.name = "Tom";
		
		// System.out.println("Name: " +first.name+", Number: "+first.number);
		
		Person1[] members;
		members = new Person1[100];
		members[0] = first;
		members[1] = second;
		
		// members[2].name = "David"; // 아무런 객체를 참조하고 있지 않으므로 오류가 발생한다.
		// members[2] = new Person();
		
		System.out.println("Name: " +members[0].name+", Number: "+members[0].number);
		System.out.println("Name: " +members[1].name+", Number: "+members[1].number);
	}
}
