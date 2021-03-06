package section1;

/*
 * IS-A 관계
 * A Notebook is a Computer
 * Computer is the superclass of Notebook
 * Notebook is a subclass of Computer
 */

public class Code01 { // 상속
	
	public void run(){
		Notebook nb = new Notebook("Dell", "15", 4, 1000, 1.2, 15.6, 1.5);
		System.out.println(nb.computerPower());
		System.out.println(nb.toString());
		
		Computer cp = new Notebook("Samsung", "15", 4, 1000, 1.2, 15.6, 1.5);
//		Notebook test3 = new Computer("LG", "15", 4, 1000, 1.2, 15.6, 1.5);
//		역은 성립하지 않는다.
		
		System.out.println(cp.toString()); // static binding vs. dynamic binding
//		자바에서는 항상 동적바인딩이 일어난다. 
//		(cp의 타입은 computer지만 실제 참조하고 있는 객체는 Notebook이므로 Notebook의 toString()이 호출된다.
	}
	
	public static void main(String[] args){
		Code01 test = new Code01();
		test.run();
	}

}
