package pg110;

public class Person {

	String name,email,city,state;	
	long phno;
	Person(String name,String city,String state,String email,long phno)
	{
		this.name=name;
		this.city=city;
		this.state=state;
		this.email=email;
		this.phno=phno;
	}
	public String toString()
	{
		return "Name: "+name+"\nEmail: "+email+"\nPhone number: "+phno+"\nCity: "+city+"\nState: "+state;
	}
}
