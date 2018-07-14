package section2;

import java.util.Scanner;

/*
 * 4종류의 이벤트
 * 
 * 1. 일회성 이벤트
 * 2. 기간이 지정된 이벤트
 * 3. 데드라인이 있는 이벤트
 * 4. 주기적 이벤트
 * 
 */

/*
 * 사용 예
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
 * $ show 2017/1/15 해당 날짜에 걸리는 이벤트만 출력
 * 
 * $ exit
 * 
 */

public class Scheduler {

	// 서로 다른 타입의 객체를 하나의 배열에 assign
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
		title = kb.next(); // 첫 String만 입력된다
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
 * 	System.out.println(tokens[i]); <- 배열에 문자열을 나눠서 저장하여 리턴하여 준다
 *
 * special char를 token으로 사용하기 위해서는 \\ 후 문자열
 * ex)str.split("\\.")
 */


/* 배열 재할당 */
/*
 * private void reallocate(){ // 배열의 크기를 2배로 늘린다
 * 		Event[] tmpArray = new Event[capacity *2];
 * 		for(int i=0; i<n; i++)
 * 			tmpArray[i] = events[i];
 * 		events = tmpArray;
 * 		capacity *2;
 */

