package section3;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/* ���� ��
 * $read sample.txt
 * $find heaven
 * The world "heaven" appears 13 times.
 * $saveas index.txt
 * $find java
 * The word "java" does not appear.
 * $exit
 */

public class Code22 { // �ε��� ����Ŀ

	static String [] words = new String[1000000];
	static int [] count = new int [1000000];
	static int n = 0;

	static public void main(String[] args){
		Scanner kb = new Scanner(System.in);

		while(true){
			System.out.print("$ ");
			String command = kb.next();
			if(command.equals("read")){
				String fileName = kb.next();
				makeIndex(fileName);
			}
			else if(command.equals("find")){
				String str = kb.next();
				int index = findWord(str);
				if(index != -1){
					System.out.println("The word " + words[index] + " appears " + count[index] + " times.");
				}
				else
					System.out.println("The word " + str + " does not appear.");
			}
			else if(command.equals("saveas")){
				String fileName = kb.next();
				saveAs(fileName);

			}
			else if(command.equals("exit"))
				break;

			else
				System.out.print("Wrong command");
		}

		kb.close();

	}

	static void makeIndex(String fileName){
		try {
			Scanner inFile = new Scanner(new File(fileName));
			while(inFile.hasNext()){
				String str = inFile.next();
				addWord(str);
			}
		} 

		catch (FileNotFoundException e) {
			System.out.println("No File");
			return;
		}
	}

	static void addWord(String str){ // ���ڿ� ��Ͽ� �ִ���
		int index = findWord(str); // return -1 if not found
		if(index != -1){
			count[index]++;
		}
		else{
			words[n] = str;
			count[n] = 1;
			n++;
		}
	}

	static int findWord(String str){
		for(int i=0; i<n; i++)
			if(words[i].equalsIgnoreCase(str)) // ��ġ�ϸ� �迭 index ����
				return i;
		return -1; // ã�� �ܾ ���� ���
	}

	static void saveAs(String fileName){
		PrintWriter outFile;
		try {
			outFile = new PrintWriter(new FileWriter(fileName));
			for(int i=0; i<n; i++){
				outFile.println(words[i] + " " + count[i]);
			}

			outFile.close();
		} 
		catch (IOException e) {
			System.out.println("Save failed!");
			return;
		}


	}
}

















