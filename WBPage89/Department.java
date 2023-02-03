//Department class
package javaLab;

import java.util.Scanner;

public class Department {

	static Student obj[]=new Student[10];
	static int scount=0;
	 
	static void addNewStudent() {
		Scanner sc=new Scanner(System.in);
		obj[scount]=new Student();
		System.out.println("Enter name: ");
		boolean a=obj[scount].setName(sc.next());
		while(a==false)
		{
			System.out.println("Enter valid Name: ");
			a=obj[scount].setName(sc.next());
		}
		System.out.println("Enter ID: ");
		boolean b=obj[scount].setId(sc.nextLong());
		while(b==false)
		{
			System.out.println("Enter valid ID: ");
			b=obj[scount].setId(sc.nextLong());
		}
		System.out.println("Enter Gender: ");
		boolean c=obj[scount].setGender(sc.next().charAt(0));
		while(c==false)
		{
			System.out.println("Enter valid Gender(M/F): ");
			c=obj[scount].setGender(sc.next().charAt(0));
		}
		System.out.println("Enter Branch: ");
		boolean d=obj[scount].setBranch(sc.next());
		while(d==false)
		{
			System.out.println("Enter valid Branch: ");
			d=obj[scount].setBranch(sc.next());
		}
		scount++;
		
	}
	static void printAllStudents() {
		int i;
		for(i=0;i<scount;i++)
		{
			System.out.println(obj[i].toString());
		}
	}
	static boolean searchStudentID() {
		long id;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ID to be searched: ");
		id=s.nextLong();
		int i,f=0;
		for(i=0;i<scount;i++)
		{
			if(id==obj[i].id)
			{
				f=1;
				System.out.println("Found at "+(i+1));
				return true;
			}
		}
		if(f==0)
			System.out.println("Not Found");
			return false;
	}
	static boolean searchStudentName() {
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name to be searched: ");
		name=s.next();
		int i,f=0;
		for(i=0;i<scount;i++)
		{
			if(name.equals(obj[i].name))
			{
				f=1;
				System.out.println("Found at "+(i+1));
				return true;
			}
		}
		if(f==0)
			System.out.println("Not Found");
			return false;
	}
	static boolean modifyName() {
		long id;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ID to be searched: ");
		id=s.nextLong();
		int i;
		for(i=0;i<scount;i++)
		{
			if(id==obj[i].id)
			{
				System.out.println("Enter new Name: ");
				obj[i].name=s.next();
				return true;
			}
		}
		return false;
	}
}
