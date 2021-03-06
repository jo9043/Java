package section2;

public class DeadLineEvent extends Event {
	private String title;
	private myDate deadline;
	
	public DeadLineEvent(String title, myDate date){
		super(title);
		this.deadline = date;
	}
	
	public String toString(){
		return title + ", " + deadline.toString();
	}
}
