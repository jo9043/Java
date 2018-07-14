package section1;
import java.util.Scanner;

public class Code15 { // 입력 받고 바로 정렬
		public static void main(String[] args){
			int n;
			Scanner scan = new Scanner(System.in);
			n = scan.nextInt();
			int data[] = new int[n];
			
			for(int i=0; i<n; i++){
				int tmp = scan.nextInt();
				int j = i-1;
				while(j>=0 && data[j]>tmp){
					data[j+1] = data[j];
					j--;
				}
				data[j+1] = tmp;
				
				for(int k=0; k<=i; k++)
					System.out.print(data[k] + ", ");
				System.out.println();
			}
			scan.close();
		}
}
