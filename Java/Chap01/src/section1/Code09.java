package section1;
import java.util.Scanner;

public class Code09 { // Shift
	public static void main(String[] args) {
		int n,tmp;
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
				
		int data[] = new int [n];
		for(int i=0; i<n; i++){
			data[i] = kb.nextInt();
		}
		kb.close();
		
		tmp = data[n-1];
		for (int i=n-2; i>=0; i--){
			data[i+1] = data[i];
		}
		data[0] = tmp;
		
		for(int i=0; i<n; i++)
			System.out.print(data[i] + ", ");

	}

}
