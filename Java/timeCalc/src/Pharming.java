import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * $ file
 * $ time
 * 
 * 
 */

public class Pharming {
	public void processCommand(){
		System.out.print("$ ");
		Scanner kb = new Scanner(System.in);
		String cmd = kb.next();
			while(true){
				if(cmd.equals("file")){
					
					try {
						Scanner in = new Scanner(new File("pharm.txt"));
						
						while(in.hasNext()){
							
						}
					}
					catch (FileNotFoundException e) {
						System.out.print("No Data File");
						System.exit(1);
					}
				}
				else if(cmd.equals("time")){
					
					
				}
				else if(cmd.equals("exit"))
					break;
			}
		
	}
	
	public static void main(String[] args){
		Pharming pharm = new Pharming();
		pharm.processCommand();
	}
}
