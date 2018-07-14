package section1;
import java.util.Scanner;

public class Code03 { // 문자열 입출력

	public static void main(String[] args) {
		String str = "Hello";
		String input = null;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please type a string: ");
		input = kb.next(); //공백문자를 기준으로 입력받는다
		System.out.println("Your input: " + input);
		
		//if(str == input)
		if(str.equals(input))
			System.out.println("Strings match!");
		else
			System.out.println("Strings do not match!");
		
		kb.close();

	}

}
