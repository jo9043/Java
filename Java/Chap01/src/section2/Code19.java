package section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 { // �����Է�

	public static void main(String[] args) {
		try {
			int count = 0;
			
			Scanner inFile;
			inFile = new Scanner(new File("input.txt")); //������Ʈ �����ȿ� �־�� ��
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
		
		} catch (FileNotFoundException e) { // ������ ���� ���� ���� ó���� ����� ��
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		} 

	}
}
