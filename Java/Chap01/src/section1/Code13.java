package section1;
import java.util.Scanner;

public class Code13 { // ���ӵ� ���� �� �ִ밪 �Ҽ�

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int [n];
		
		for(int i=0; i<n; i++){
			data[i] = kb.nextInt();
		}
	
		kb.close();
	
		int max = 0;
		for(int i=0; i<n; i++){
			for(int j=i; j<n; j++){
				//data[i]...data[j] into an integer
				//test if is a prime
				//if yes, compare
				
				int val =0; //������ ������ 2^32���� �� �̻��� overflow 
				
				for(int k=i; k<=j; k++)
					val = val * 10 + data[k];
				
				boolean isPrime = true;
				
				// val�� 1�ΰ�� ����
				for(int k=2; k*k<val; k++){
					if (val % k ==0){
						isPrime = false;
						break;
					}
				}
				if(isPrime && val>1 && val>max)
					max = val;
			}
		}

		if (max > 0)
			System.out.print(max);
		else
			System.out.print("no Prime");
	}

}
