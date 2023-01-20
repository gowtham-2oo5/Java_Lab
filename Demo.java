package weekFour;

import java.util.Scanner;

public class Demo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice.");
		System.out.println("1:Create default account\n2:Create account with specified id and initial balance\n3:Deposit amount\n4:Withdraw amount\n5:Details");
		int c=sc.nextInt();
		while(c!=0)
		{
			switch(c)
			{
				case 1:new Account();break;
				case 2:{
					System.out.println("Enter id of your choice below 1000 and enter initial balance");
					int id=sc.nextInt(),bal=sc.nextInt();
					
					while(Account.getIdBalance(id,bal)==false)
					{
						System.out.println("Please enter valid id and balance");
						Account.getIdBalance(sc.nextInt(),sc.nextInt());
					}
				
					new Account(id, bal);
				}break;
				case 3:{
					System.out.println("Enter amount to deposit.");
					while(Account.deposit(sc.nextInt()) == false) {
						System.out.println("Enter valid amount");
						Account.deposit(sc.nextInt());
					}
				}break;
				case 4:{
					System.out.println("Enter amount to withraw.");
					while(Account.withdraw(sc.nextInt()) == false) {
						System.out.println("Enter valid amount");
						Account.withdraw(sc.nextInt());
				}
				}break;
				case 5:Account.getDetails();break;
	
				default:{
					System.out.println("THE END");System.exit(0);
					
				}break;
			}		
		c=sc.nextInt();
		}
		sc.close();
	}

	
}

