package section1;
import java.util.Scanner;

public class Code13 { // 연속된 원소 중 최대값 소수

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
				
				int val =0; //정수형 변수는 2^32까지 그 이상은 overflow 
				
				for(int k=i; k<=j; k++)
					val = val * 10 + data[k];
				
				boolean isPrime = true;
				
				// val가 1인경우 오류
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
