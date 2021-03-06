package section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 { // 파일 입력 받은 후 정렬해서 출력
	
	// 클래스 멤버
	static String[] name = new String[1000];
	static String[] number = new String[1000];
	static int count = 0;
	
	public static void main(String[] args) {
	
		try {
			Scanner inFile;
			inFile = new Scanner(new File("input.txt"));
			//String name = inFile.next();
			
			while(inFile.hasNext()){ // detect End of File
				name[count] = inFile.next();
				number[count] = inFile.next();
				count++;
			}
			
			inFile.close();
	
		} catch (FileNotFoundException e) { // 파일이 없을 때의 예외 처리를 해줘야 함
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		} 
		
		bubbleSort();
		
		for(int i=0; i<count; i++)
			System.out.println("Name:"+name[i]+", Phone:"+number[i]);
	}
	
	static private void bubbleSort(){
		for(int i= count-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(name[j].compareTo(name[j+1]) > 0){ // -1, 0, 1
					String tmp = name[j];
					name[j] = name [j+1];
					name[j+1] = tmp;
					
					tmp = number[j];
					number[j] = number[j+1];
					number[j+1] = tmp;
				}
			}
		}
	}
}
