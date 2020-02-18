class Date{
	private int day;
	private int month;
	private int year;
	public Date(){
		this.day=1;
		this.month=2;
		this.year=2020;
		}
	public Date(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
		}
	public int getDay(){
		return this.day;
		}
	public int getMonth(){
		return this.month;
		}
	public int getYear(){
		return this.year;
		}
	public void setDay(){
		this.day=day;
		}
	public void setMonth(int month){
		this.month=month;
		}
	public void setYear(int year){
		this.year=year;
		}
	public int print(){
		System.out.println(getDay);
	}
	
}		
public class testDate{
	public static void main(String args[]){
		Date d1=new Date(5,2,2016);
		Date d2=new Date(7,4,2020);
		
		print.d1.setDay();
		}
	}	