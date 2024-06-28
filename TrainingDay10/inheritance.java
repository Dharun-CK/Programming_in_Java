import java.util.*;

class animal 
	{
		void display()
		{
	System.out.println("**********************************************************");

	}
	}
	
	class lion extends animal 
	{
		int vishnu() 
		{
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		return 0;
	}
	}
	
	class tiger extends lion
	{
		void displa()
		{
			System.out.print("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		}
	}
	
	
public class inheritance
	{
	public static void main(String[] args)
	{
		tiger lo=new tiger();
		lo.display();
		lo.vishnu();
		lo.displa();
	}
}
	