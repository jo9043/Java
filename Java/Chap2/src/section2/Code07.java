package section2;

import java.util.Scanner;

/*
 * 클래스는 서로 관련있는 데이터들을 하나의 단위로 묶어두기 위한 것
 * 또한 그 데이터와 관련이 깊은 메서드도 함께 묶어둘수 있다
 * 이렇게 함으로써 코드의 응집도를 높이고 결합도를 낮출 수 있다.
 * 모듈간의 상호의존성이 떨어져 구조가 단순해진다.
 */

public class Code07 {
	static Polynomial2 [] polys = new Polynomial2[50];
	static int n = 0;

	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		while(true){
			System.out.print("$ ");
			String command = kb.next();
			if(command.equals("create")){
				char name = kb.next().charAt(0);

				Polynomial2 p = new Polynomial2();
				p.name = name;
				p.nTerms = 0;
				polys[n] = p;
				polys[n].terms = new Term2[100];
				n++;
			}
			else if(command.equals("add")){
				char name = kb.next().charAt(0);
				int index = find(name);

				if(index == -1)
					System.out.println("No such polynomial exists.");
				else{
					int c = kb.nextInt();
					int e = kb.nextInt();
					polys[index].addTerm(c, e);
				}
			}
			else if(command.equals("calc")){
				char name = kb.next().charAt(0);
				int index = find(name);

				if(index == -1)
					System.out.println("No such polynomial exists.");
				else{
					int x = kb.nextInt();
					int result = polys[index].calcPolynomial(x);
					System.out.println(result);

				}

			}
			else if(command.equals("print")){
				char name = kb.next().charAt(0);
				int index = find(name);

				if(index == -1)
					System.out.println("No such polynomial exists.");
				else{
					polys[index].printPolynomial();

				}
			}
			else if(command.equals("exit")){
				break;
			}
		}
	}

	private static int find(char name) {
		for(int i=0; i<n; i++){
			if(polys[i].name == name){
				return i;
			}
		}
		return -1;
	}
}
