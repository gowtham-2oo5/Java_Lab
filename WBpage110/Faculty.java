package pg110;

public class Faculty extends Employee{

	int ofhrs,rank;
	Faculty(int ofhrs,int rank,String office,int sal,int date,int month,int yr,String name,String city,String state
			,String email,long phno){
		super(office,sal,date,month,yr,name,city,state,email,phno);
		this.ofhrs=ofhrs;
		this.rank=rank;
	}
	public String toString() {
		System.out.println(super.toString());
		return "Office hours: "+ofhrs+"\nRank: "+rank;
	}
}
