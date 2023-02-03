//Main class
package javaLab;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		boolean k=true;
		while(k)
		{
			System.out.println("Enter your choice...");
			System.out.println("1. Add new Student");
			System.out.println("2. Print details of Students");
			System.out.println("3. Search by ID");
			System.out.println("4. Search by Name");
			System.out.println("5. Modify name by ID");
			System.out.println("6. Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:Department.addNewStudent();break;
			case 2:Department.printAllStudents();break;
			case 3:if(Department.searchStudentID()==false)
				System.out.println("Not Found");
				break;
			case 4:if(Department.searchStudentName()==false)
				System.out.println("Not Found");
				break;
			case 5:if(Department.modifyName()==false)
				System.out.println("Not Found");
				break;
			case 6:k=false;break;
			default:break;
			}
		}
		sc.close();
		
		
	}

}
