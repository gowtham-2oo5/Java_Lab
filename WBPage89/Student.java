//Student Class
package javaLab;

public class Student {
	long id;
	String name,branch;
	char gender;
	boolean setName(String name)
	{
		int fl=0,i;
		for(i=0;i<name.length();i++)
		{
			if(Character.isAlphabetic(name.charAt(i))==false)
				fl++;
		}
		if(fl>0)
		return false;
		else
		{
			this.name=name;
			return true;
		}
	}
	boolean setBranch(String branch) {
		if(branch.equals("CSE"))
		{
			this.branch=branch;
			return true;
		}
		else if(branch.equals("ECSE"))
		{
			this.branch=branch;
			return true;
		}
		else if(branch.equals("ME"))
		{
			this.branch=branch;
			return true;
		}
		else if(branch.equals("CE"))
		{
			this.branch=branch;
			return true;
		}
		else if(branch.equals("EE"))
		{
			this.branch=branch;
			return true;
		}
		else if(branch.equals("ECE"))
		{
			this.branch=branch;
			return true;
		}
		else
			return false;
		
	}
	boolean setId(long ID) {
		long k=ID;
		long count=0;
		while(ID!=0)
		{
			count++;
			ID/=10;
		}
		if(count==10)
		{
			id=k;
			return true;
		}
		return false;
	}
	boolean setGender(char gender) {
		if(gender=='M' || gender=='F')
		{
			this.gender=gender;
			return true;
		}
		return false;
	}
	String getName()
	{
		return "Name: "+name;
	}
	String getGender()
	{
		return "Gender: "+gender;
	}
	String getBranch()
	{
		return "Branch: "+branch;
	}
	String getId()
	{
		return "ID: "+id;
	}
	public String toString()
	{
		String s=String.format("%s\n%s\n%s\n%s",getName(),getBranch(),getId(),getGender());
		return s;
	}
}
