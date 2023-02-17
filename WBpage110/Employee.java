package pg110;

public class Employee extends Person{

	String office;
	int sal;
	int date,month,yr;
	Employee(String office,int sal,int date,int month,int yr,String name,String city,String state,String email,long phno){
		super(name,city,state,email,phno);
		this.office=office;
		this.sal=sal;
		this.date=date;
		this.month=month;
		this.yr=yr;
	}
	public String toString() {
		System.out.println(super.toString());
		return "Office name: "+office+"\nSalary: "+sal+"\nHiring date: "+date+"-"+month+"-"+yr; 
	}
}
