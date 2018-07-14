package section1;
import java.util.*;

public class Code11 { // Áßº¹ ½Ö °¹¼ö

	public static void main(String[] args) {
		int n,count=0;
		
		System.out.print("Array Size: ");
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		
		System.out.print("input intergers: ");
		
		int data[] = new int[n];
		for(int i=0; i<n; i++){
			data[i] = kb.nextInt();
		}
		
		kb.close();
		
		for(int i=0; i<n; i++)
			for(int j=i+1; j<n; j++)
				if(data[i] == data[j])
					count++;
		
		System.out.println(count);

	}

}
