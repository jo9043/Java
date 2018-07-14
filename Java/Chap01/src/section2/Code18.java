package section2;
import java.util.Scanner;

public class Code18 { // bubbleSort 함수
	public static void main(String[] args){
		int n;

		Scanner kb = new Scanner(System.in);

		System.out.print("배열 크기 입력: ");
		n = kb.nextInt();

		System.out.print("데이터 입력: ");
		int data[] = new int[n];
		for(int i=0; i<n; i++){
			data[i] = kb.nextInt();
		}

		kb.close();

		bubbleSort(data);

		for(int i=0; i<n; i++){
			System.out.print(data[i] + " ");
		}

	}

	static void bubbleSort(int data[]){
		for(int i=data.length-1; i>=0; i--){
			for(int j=0; j<i; j++){
				if(data[j]>data[j+1]){
					int tmp = data[i];
					data[i] = data[j+1];
					data[j+1] = tmp;
					
					//wrongSwap(data[j],data[j+1]);
				}
					
			}
		}
	}

// Java에서는 프리미티브 타입에 대한 call by value만 지원하기 때문에 swap 함수를 구현 할 수 없다.	
	static void wrongSwap(int a, int b){
		int tmp = a;
		a = b;
		b = tmp;
	}
	
}


/*
값에 의한 호출 (Call by value)

호출문: 
Swap(data[j],data[j+1]) <- actual parameter

호출된 메서드:
public static void swap(int a, int b){ <- formal parameter
	int tmp;
	a = b;
	b = tmp;
}

actual parameter와 formal parameter는 별개의 값
함수를 호출할때 actual parameter가 formal paramter로 딱 한번 복사된다.
swap 함수는 복사된 formal paramter의 자리를 바꿔주기 때문에 원본은 변화가 없다.

참조에 의한 호출
호출된 메서드
public static void swap(int &a, int &b){
 	int tmp;
 	a = b;
 	b = tmp;
 }

# 배열(프리미티브 타입이 아닌 경우)을 매개변수로 넘겨주는 경우는 정삭적으로 동작한다. #
 
프리미티브 타입

byte, short, int, long, float, double, char, boolean













 */