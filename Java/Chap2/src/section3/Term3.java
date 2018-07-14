package section3;

/*
 * 접근제어 (Access Modifier)
 * 
 * public: 클래스 외부에서 접근이 가능
 * private: 클래스 내부에서만 접근이 가능
 * default: 동일 패키지에 있는 다른 클래스에서 접근이 가능
 * protected: 동일 패키지의 다른 클래스와 
 * 			다른 패키지의 하위 클래스에서도 접근이 가능
 */

/*
 * 데이터 캡슐화
 * 
 * 모든 데이터 멤버를 private으로 만들고 필요한 경우에 public한 get/set 메서드를 제공한다
 * 객체가 제공해주는 메서드를 통하지 않고서는 객체 내부의 데이터에 접근할 수 없다
 * 이것을 data encapsulation 혹은 information hiding이라고 부른다
 * 
 */

public class Term3 {
	private int coef;
	private int expo;

	public int getExpo(){ // getter method
		return expo;
	}

	public int getCoef(){ // getter
		return coef;
	}

	public void setCoef(int coef){ // setter 
		this.coef = coef;
	}

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
