package section1;
import java.util.Scanner;


public class Code05 { // 배열
	public static void main(String[] args) {
		
		// in C, int grades[5];
		
		int[] grades;
		grades = new int[5];
		
		// 배열 동적 선언 1
		/*
		int n = 100;
		int[] arr = new int[n]; // variable length array
		
		Scanner kb = new Scanner(System.in);
		*/
		
		// 배열 동적 선언 2
		/* 
		int n2 = kb.nextInt();
		int[] arr2 = new int [n2];
		*/
		
		//kb.close();
		
		
		//int[] grades = new int[5];
		
		//assign value
		
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		System.out.println(grades[4]);

	}

}
