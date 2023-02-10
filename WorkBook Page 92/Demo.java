package wbpaeg92;

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
			System.out.println("1. Add new Book");
			System.out.println("2. Print details");
			System.out.println("3. Search Book by Id");
			System.out.println("4. Search Book by Name");
			System.out.println("5. Modify author name by Id");
			System.out.println("6. Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: Library.addNewBook();break;
			case 2: Library.printAllDetails();break;
			case 3: Library.searchById();break;
			case 4: Library.searchByName();break;
			case 5: Library.modifyAuthor();break;
			case 6: k=false;break;
			}
		}
		sc.close();
	}

}
