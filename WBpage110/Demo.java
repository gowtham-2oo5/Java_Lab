package pg110;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter the city and state: ");
		String city=sc.next(),state=sc.next();
		System.out.println("Enter email address: ");
		String email=sc.next();
		System.out.println("Enter phone number: ");
		long phno=sc.nextLong();
		System.out.println("Enter your Student status(freshman/sophmore/jr/sr): ");
		String status=sc.next();
		Student s=new Student(status,name,city,state,email,phno);
		System.out.println("Employee:  ");
		System.out.println("Enter office name: ");
		String office=sc.next();
		System.out.println("Enter monthly salary: ");
		int sal=sc.nextInt();
		System.out.println("Enter hiring date: ");
		int date=sc.nextInt(),month=sc.nextInt(),yr=sc.nextInt();
		Employee e=new Employee(office,sal,date,month,yr,name,city,state,email,phno);
		System.out.println("Enter Staff title: ");
		String title=sc.next();
		Staff st=new Staff(title,office,sal,date,month,yr,name,city,state,email,phno);
		System.out.println("Faculty: ");
		System.out.println("Enter office hours: ");
		int ofhrs=sc.nextInt();
		System.out.println("Enter rank: ");
		int rank=sc.nextInt();
		Faculty f=new Faculty(ofhrs,rank,office,sal,date,month,yr,name,city,state,email,phno);
		sc.close();
		System.out.println("______________");
		System.out.println("Student Class: ");
		System.out.println(s.toString());
		System.out.println("______________");
		System.out.println("Employee class: ");
		System.out.println(e.toString());
		System.out.println("______________");
		System.out.println("Staff class: ");
		System.out.println(st.toString());
		System.out.println("______________");
		System.out.println("Faculty class: ");
		System.out.println(f.toString());
		
	}

}
