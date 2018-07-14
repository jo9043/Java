package section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 { // 파일입력

	public static void main(String[] args) {
		try {
			int count = 0;
			
			Scanner inFile;
			inFile = new Scanner(new File("input.txt")); //프로젝트 폴더안에 있어야 함
			//String name = inFile.next();
			
			String[] name = new String[1000];
			String[] number = new String[1000];
			
			while(inFile.hasNext()){ // detect End of File
				name[count] = inFile.next();
				number[count] = inFile.next();
				count++;
			}
			
			for(int i=0; i<count; i++)
				System.out.println("Name:"+name[i]+", Phone:"+number[i]);
			
			inFile.close();
		
		} catch (FileNotFoundException e) { // 파일이 없을 때의 예외 처리를 해줘야 함
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		} 

	}
}
