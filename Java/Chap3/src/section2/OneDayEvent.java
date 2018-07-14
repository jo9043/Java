package section2;

public class OneDayEvent extends Event {
	private String title;
	private myDate date;
	
	public OneDayEvent(String title, myDate date){
		super(title);
		this.date = date;
	}
	
	public String toString(){
		return super.toString() + ", " + date.toString();
	}
}
