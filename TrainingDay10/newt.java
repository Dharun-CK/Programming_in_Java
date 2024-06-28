interface dad
{
	String str = "I AM KRATOS ";
}
class mom implements dad
{
	void dis()
	{
		System.out.println("GOD OF WARR"+str);
	}
}

 class son extends mom
{
	 void d1()
	 {
		 System.out.println(str+" "+"GOD OF PEACE");
	 }
}



public class newt extends mom 
{
	public static void main(String[] args)
	{
{
	son b=new son();
	mom a = new mom();
	a.dis();
	b.dis();
	b.d1();
	//System.out.println(a.str);
	System.out.println(b.str);
}
}
}