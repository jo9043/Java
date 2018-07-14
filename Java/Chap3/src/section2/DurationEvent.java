package section2;

public class DurationEvent extends Event {
	private String title;
	private myDate begin;
	private myDate end;
	
	public DurationEvent(String title, myDate b, myDate e){
		super(title);
		this.begin = b;
		this.end = e;
	}
	
	public String toString(){
		return title + ", " + begin.toString() + "~" + end.toString();
	}

}
