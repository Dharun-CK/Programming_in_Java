import java.util.*;
class BankAccount
{
	public int Bal = 10000;
	    
	void Deposit(int x) 
	{
		Bal=Bal+x;
		System.out.println("DEPOSIT :The Balance: "+Bal);
		
	}
	void withdraw(int x)
	{
		Bal=Bal-x;
		System.out.println("WITHDRAW:The Balance: "+Bal);
		
	}
}
class S_Account extends BankAccount
{
	BankAccount ac = new BankAccount();
	
	void withdraw(int x) 
	{ 
		if( Bal-x <=100)
		{
			System.out.println("WITHDRAW:Minimum Balance Needed");
			}
		else
			ac.withdraw(x);	
}
}


public class Bank {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	
	int a=s.nextInt();
     S_Account b = new S_Account();
     b.Deposit(a);
     b.withdraw(a);

}
}
