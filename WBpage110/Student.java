package pg110;

public class Student extends Person {

	String status;
	Student(String status,String name,String city,String state,String email,long phno)
	{
		super(name,city,state,email,phno);
		this.status=status;
	}
	public String toString() {
		System.out.println(super.toString());
		return "Status: "+status;
	}

}
