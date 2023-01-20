package weekFour;

public class Account {
	static private int id,bal;
	Account()//Create a default account
	{
		id=(int)(Math.random()*1000);
		bal=200;
		System.out.println("Your id is:"+id+"\nYour initial balance is: "+bal);
		System.out.println("___________________________________");
		System.out.println("Enter your choice:");
		System.out.println("1:Create default account\n2:Create account with specified id and initial balance\n3:Deposit amount\n4:Withdraw amount\n5:Details\n6:Leave");
		
	}
	static boolean getIdBalance(int id,int bal)
	{
		if(id>0 && bal>0)
		{
			System.out.println("___________________________________");
			System.out.println("Enter your choice:");
			System.out.println("1:Create default account\n2:Create account with specified id and initial balance\n3:Deposit amount\n4:Withdraw amount\n5:Details\n6:Leave");
			
			return true;
			
		}
		return false;
	}
	Account(int lol,int baal)//Account with specified id and initial balance
	{
		id=lol;
		Account.bal=baal;
		System.out.println("___________________________________");
		System.out.println("Enter your choice:");
		System.out.println("1:Create default account\n2:Create account with specified id and initial balance\n3:Deposit amount\n4:Withdraw amount\n5:Details\n6:Leave");
	
	}
	static boolean deposit(int amt) {
		if(amt>0) {
			bal=bal+amt;
			System.out.println("\nYour new balance is: "+ bal);
			System.out.println("___________________________________");
			System.out.println("Enter your choice:");
			System.out.println("1:Create default account\n2:Create account with specified id and initial balance\n3:Deposit amount\n4:Withdraw amount\n5:Details\n6:Leave");
			return true;
		}
		return false;
	}
	static boolean withdraw(int amt) {
		if(amt<=bal)
		{
			bal=bal-amt;
			System.out.println("\nYour new balance is: "+ bal);
			System.out.println("___________________________________");
			System.out.println("Enter your choice:");
			System.out.println("1:Create default account\n2:Create account with specified id and initial balance\n3:Deposit amount\n4:Withdraw amount\n5:Details\n6:Leave");
			return true;
		}
		return false;
		}
	static void getDetails() {
		System.out.println("ID: "+id+"\nBalance: "+bal);
		System.out.println("___________________________________");
		System.out.println("Enter your choice:");
		System.out.println("1:Create default account\n2:Create account with specified id and initial balance\n3:Deposit amount\n4:Withdraw amount\n5:Details\n6:Leave");
		
	}
}
