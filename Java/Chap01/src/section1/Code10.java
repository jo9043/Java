package section1;

public class Code10 { // 소수 출력

	public static void main(String[] args) {
		/*
		int n = 4;
		boolean isPrime = true;
		
		// 2, 3, 4, ... sqrt(n)
		for(int i=2; i*i<=n; i++){
			if(n%i == 0){
				isPrime = false;
				break; // 자신을 둘러싼 가장 안쪽 반복문을 빠져나옴
			}
		}
		if(isPrime)
			System.out.println(n);
		*/
		
		int n=100000,k=0;
		int data[] = new int[n];
		
		for(int j=2; j<n; j++){
			boolean isPrime = true;
	
			for(int i=2; i*i<j; i++){
				if(j%i == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime == true){
				data[k] = j;
				k++;
			}
		}
		
		System.out.print("#Prime: " + k + "\nList: ");
		
		for(int i=0; i<k; i++){
			System.out.print(data[i] + ", ");
		}
	}
}
