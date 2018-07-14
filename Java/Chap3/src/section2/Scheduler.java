package section2;

import java.util.Scanner;

/*
 * 4������ �̺�Ʈ
 * 
 * 1. ��ȸ�� �̺�Ʈ
 * 2. �Ⱓ�� ������ �̺�Ʈ
 * 3. ��������� �ִ� �̺�Ʈ
 * 4. �ֱ��� �̺�Ʈ
 * 
 */

/*
 * ��� ��
 * 
 * $ addevent oneday
 * 		when: 
 * 		title:
 * & addevent duration
 * 		begin:
 * 		end:
 * 		title:
 * $ addevent deadline
 * 		until;
 * 		title:
 * $ addevent oneday
 * 		when:
 * 		title:
 * $ list
 * $ show 2017/1/15 �ش� ��¥�� �ɸ��� �̺�Ʈ�� ���
 * 
 * $ exit
 * 
 */

public class Scheduler {

	// ���� �ٸ� Ÿ���� ��ü�� �ϳ��� �迭�� assign
	private int capacity = 10;
	public Event[] events = new Event[capacity];
	public int n = 0;
	private Scanner kb;
	

	public void processCommand(){
		kb = new Scanner(System.in);
		while(true){
			System.out.print("$ ");
			String command = kb.next();

			if(command.equals("addevent")){
				String type = kb.next();
				if(type.equalsIgnoreCase("oneday"))
					handleAddOneDayEvent();
				else if (type.equalsIgnoreCase("duration"))
					handleAddDurationEvent();
				else if (type.equalsIgnoreCase("deadline"))
					handleAddDeadlineEvent();
			}
			else if(command.equals("list")){
				handleList();
			}
			else if(command.equals("show")){

			}
			else if(command.equals("exit")){
				break;
			}
		}
		kb.close();
	}

	private void handleList() {
		for(int i=0; i<n; i++){
			System.out.println(" " + events[i].toString());
		}
		
	}

	private void handleAddDeadlineEvent() {
		// TODO Auto-generated method stub

	}

	private void handleAddDurationEvent() {
		// TODO Auto-generated method stub

	}

	private void handleAddOneDayEvent() {
		String dateString;
		String title;

		System.out.print("\tWhen: ");
		dateString = kb.next();
		myDate date = parseDateString(dateString);
		System.out.print("\tTitle: ");
		title = kb.next(); // ù String�� �Էµȴ�
		OneDayEvent ev = new OneDayEvent(title, date );
		
		System.out.println(ev.toString());
		addEvent(ev);
	}
	
	

	private void addEvent(OneDayEvent ev) {
		if (n>= capacity)
			reallocate();
		events[n++] = ev;
	}

	private void reallocate() {
		Event [] tmp = new Event[capacity *2];
		for(int i=0; i<n; i++)
			tmp[i] = events[i];
		events = tmp;
		capacity *=2;
	}

	private myDate parseDateString(String dateString) {
		String[] tokens = dateString.split("/");
		//token[0] = 2017
		
		int year = Integer.parseInt(tokens[0]);
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);
		
		myDate d = new myDate(year,month,day);
		return d;
	}

	public static void main(String[] args){
		Scheduler app = new Scheduler();
		app.processCommand();
	}
}

/* Splitting a String */
/*
 * String str = "012-3456-789;
 * String[] tokens = str.split("-");
 * for(int i=0; i<tokens.length; i++)
 * 	System.out.println(tokens[i]); <- �迭�� ���ڿ��� ������ �����Ͽ� �����Ͽ� �ش�
 *
 * special char�� token���� ����ϱ� ���ؼ��� \\ �� ���ڿ�
 * ex)str.split("\\.")
 */


/* �迭 ���Ҵ� */
/*
 * private void reallocate(){ // �迭�� ũ�⸦ 2��� �ø���
 * 		Event[] tmpArray = new Event[capacity *2];
 * 		for(int i=0; i<n; i++)
 * 			tmpArray[i] = events[i];
 * 		events = tmpArray;
 * 		capacity *2;
 */
