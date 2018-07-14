package section1;
import java.util.Scanner;

public class Code02 { // Á¤¼ö ÀÔÃâ·Â
	public static void main(String[] args){
		
		int num = 123;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		
		int input = keyboard.nextInt();
		
		if(input == num)
			System.out.println("Numbers match!");
		
		else
			System.out.println("Numbers do not match!");
		
		keyboard.close(); //Scanner¸¦ ´İ¾ÆÁÜ
	}

}
