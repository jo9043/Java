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
		// ���� ū ���� ���� ���������� �����ش�.
		// �� Step���� �����Ͱ� ��ġ �Ѱ� �پ��� ȿ��
		
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
