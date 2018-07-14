package section2;

public class myDate {
	private int year;
	private int month;
	private int day;
	
	public myDate(int y, int m, int d){
		this.year = y;
		this.month = m;
		this.day = d;
	}
	
	public String toString(){
		return year + "/" + month + "/" + day; 
	}
}
