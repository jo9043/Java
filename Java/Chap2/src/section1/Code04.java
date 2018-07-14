package section1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Code04 { // �ε��� ����Ŀ
	
//	static String [] words = new String[100000];
//	static int [] count = new int[100000];
	
	static Item[] items = new Item[100000];
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
					System.out.println("The word " + items[index].words + " appears " + items[index].count + " times.");
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
				System.out.println("Wrong command");
		}
		kb.close();
	}

	static void makeIndex(String fileName){
		try {
			Scanner inFile = new Scanner(new File(fileName));
			while(inFile.hasNext()){
				String str = inFile.next();
				String trimmed = trimming(str);	

				if(trimmed != null){
					String t = trimmed.toLowerCase();
					addWord(t);
				}
			}
		} 

		catch (FileNotFoundException e) {
			System.out.println("No File");
			return;
		}
	}

	// �ܾ��� �� �ڿ� ���� Ư������ ����
	static String trimming(String str){

		// while i-th character is not letter
		int i=0;
		int j = str.length()-1;

		while(i < str.length() && !Character.isLetter(str.charAt(i))){ //str.charAt(i) >= 'a' && str.charAt(i) <= 'z'  
			i++;
		}

		while(j >= 0 && !Character.isLetter(str.charAt(j))){
			j--;
		}

		// System.out.println(str + ":" + i + ":" + j);

		// �ܾ ���ڰ� �ϳ��� ���� ��� i�� j���� Ŀ���� �Ǵ� ��Ȳ�� �߻�
		if(i>j)
			return null;
		else
			return str.substring(i,j+1);
	}

	static void addWord(String str){ // ���ڿ� ��Ͽ� �ִ���
		int index = findWord(str); // return -1 if not found

		if(index != -1){ // exist
			items[index].count++;
		}
		else{ // not exist. ordered list�� insert -> �ڿ������� �˻��ϴ°� ȿ����
			int i = n-1;
			while(i >=0 && items[i].words.compareToIgnoreCase(str)>0){
				items[i+1] = items[i];
				i--;
			}
			items[i+1] = new Item();
			items[i+1].words = str;
			items[i+1].count = 1;
			n++;
		}
	}

	static int findWord(String str){
		for(int i=0; i<n; i++)
			if(items[i].words.equalsIgnoreCase(str)) // ��ġ�ϸ� �迭 index ����
				return i;
		return -1; // ã�� �ܾ ���� ���
	}

	static void saveAs(String fileName){
		PrintWriter outFile;
		try {
			outFile = new PrintWriter(new FileWriter(fileName));
			for(int i=0; i<n; i++){
				outFile.println(items[i].words + " " + items[i].count);
			}

			outFile.close();
		} 
		catch (IOException e) {
			System.out.println("Save failed!");
			return;
		}
	}
}

















