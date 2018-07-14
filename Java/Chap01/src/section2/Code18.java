package section2;
import java.util.Scanner;

public class Code18 { // bubbleSort �Լ�
	public static void main(String[] args){
		int n;

		Scanner kb = new Scanner(System.in);

		System.out.print("�迭 ũ�� �Է�: ");
		n = kb.nextInt();

		System.out.print("������ �Է�: ");
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

// Java������ ������Ƽ�� Ÿ�Կ� ���� call by value�� �����ϱ� ������ swap �Լ��� ���� �� �� ����.	
	static void wrongSwap(int a, int b){
		int tmp = a;
		a = b;
		b = tmp;
	}
	
}


/*
���� ���� ȣ�� (Call by value)

ȣ�⹮: 
Swap(data[j],data[j+1]) <- actual parameter

ȣ��� �޼���:
public static void swap(int a, int b){ <- formal parameter
	int tmp;
	a = b;
	b = tmp;
}

actual parameter�� formal parameter�� ������ ��
�Լ��� ȣ���Ҷ� actual parameter�� formal paramter�� �� �ѹ� ����ȴ�.
swap �Լ��� ����� formal paramter�� �ڸ��� �ٲ��ֱ� ������ ������ ��ȭ�� ����.

������ ���� ȣ��
ȣ��� �޼���
public static void swap(int &a, int &b){
 	int tmp;
 	a = b;
 	b = tmp;
 }

# �迭(������Ƽ�� Ÿ���� �ƴ� ���)�� �Ű������� �Ѱ��ִ� ���� ���������� �����Ѵ�. #
 
������Ƽ�� Ÿ��

byte, short, int, long, float, double, char, boolean













 */