package section2;

public class Code17 { // 소수 출력 함수
	
	public static void main(String[] args){
		int n = 100;
		printPrime(n);
	}
	
	public static void printPrime(int n){
		int count = 0;
		boolean isPrime;
		int primeArr[] = new int[n];
		
		for(int i=2; i<n; i++){
			isPrime = true;
			for(int j=2; j<i; j++){
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime == true){
				primeArr[count]=i;
				count++;
			}
		}
		
		System.out.print("# of Prime: " + count + "\nList: ");
		for(int i=0; i<count; i++){
			System.out.print(primeArr[i] + ", ");
		}
		
	}
}
