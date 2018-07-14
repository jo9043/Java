
public class myInform extends myDate {
	
	private String x;
	private String y;
	private String place;
	private String item;
	
	public myInform(int day, int hour, int min, String x, String y, String place, String item){
		super(day, hour, min);
		this.x = x;
		this.y = y;
		this.place = place;
		this.item = item;
	}
	
	public String toString(){
		String result =  x + y + place + super.toString() + item;
		return result;
	}

}
