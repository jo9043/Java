package section1;
import java.util.Scanner;

public class Code14 { // bubbleSort
	public static void main(String[] args){
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		int data[] = new int[n];
		for(int i=0; i<n; i++){
			data[i] = scan.nextInt();
		}
		
		// Bubble Sort
		// 가장 큰 값을 제일 마지막으로 보내준다.
		// 매 Step마다 데이터가 마치 한개 줄어드는 효과
		
		for(int i=n-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(data[j]>data[j+1]){
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
		
		for(int i=0; i<n; i++){
			System.out.println(data[i]);
		}
	}
}
