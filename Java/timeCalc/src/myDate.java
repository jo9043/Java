public class myDate {
	private int day;
	private int hour;
	private int min;
	
	public myDate(int day, int hour, int min){
		this.day = day;
		this.hour = hour;
		this.min = min;
	}
	
	public String toString(){
		String result = day + "/" + hour + "/" + min;
		return result;
	}
}
