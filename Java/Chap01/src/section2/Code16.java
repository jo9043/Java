package section2;

import java.util.Scanner;

public class Code16 { // Á¦°ö ÇÔ¼ö

	public static void main(String args[]){
		int num1, num2;
		Scanner kb = new Scanner(System.in);
		num1 = kb.nextInt();
		num2 = kb.nextInt();
		
		System.out.print("Power num1^num2" + power(num1,num2));
	}
	
	public static int power(int a, int b){
		int result =1;
		for(int i=0; i<b; i++){
			result *= a; 
		}
		return result;
	}
}
