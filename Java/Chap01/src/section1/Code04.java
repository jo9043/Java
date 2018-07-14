package section1;
import java.util.Scanner;

public class Code04 { // 정수, 문자열 입출력

	public static void main(String[] args) {
		String name = null;
		int age;
		String gender;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please tyhpe your name,your age and your gender: ");
		
		name = kb.next();
		age = kb.nextInt();
		gender = kb.next();
		
		if(gender.equals("male"))
			System.out.println(name + ", your're " +age+" years old man.");
		else if(gender.equals("female"))
			System.out.println(name + ", your're " +age+" years old woman.");
		else
			System.out.println("WTF?");
		
		kb.close();

	}

}
