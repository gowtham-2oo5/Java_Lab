package pg110;

public class Staff extends Employee{

	String title;
	Staff(String title,String office,int sal,int date,int month,int yr,String name,String city,String state,String email,long phno){
		super(office,sal,date,month,yr,name,city,state,email,phno);	
		this.title=title;
	}
	public String toString() {
		System.out.println(super.toString());
		return "Title: "+title;
	}
}
