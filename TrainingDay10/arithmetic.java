import java.util.*;

class add 
{
	void addi(long x,long y) 
	{
		System.out.printf("\nTHE ADD is %d",x+y);
	}
}

class sub extends add
{
	void subt(long x,long y)
	{
		System.out.printf("\nTHE SUB is %d",x-y);
	}
}

class mul extends sub
{
	void multi(long x,long y)
	{
		System.out.printf("\nTHE MUL is %d",x*y);
	}
}
class div extends mul
{
	void divi(long x,long y)
	{
		System.out.printf("\nThe DIV is %d",x/y);
	}
}

class arithmeticd extends div 
{	
	void per(long x,long y)
	{
      Scanner sc = new Scanner (System.in);
     System.out.print("The operation:");
      char i = sc.next().charAt(0);
     
       switch(i)
     {
       case'+':	
    	add a=new add();
		a.addi(x, y);
		break;
       case'-':
		sub b=new sub();
		b.subt(x,y);
		break;
       case'*':
		mul c=new mul();
		c.multi(x, y);
		break;
       case'/':
		div d=new div();
		d.divi(x, y);
		break;
	} 
	}
}
class arithmetic 
{
	public static void main(String[] args) 
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("A:");
		long a = sc.nextLong();
		System.out.println("B:");
		long b = sc.nextLong();
	    arithmeticd ar = new arithmeticd();
	    ar.per(a,b);	
		}
}