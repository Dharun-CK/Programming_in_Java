 class A1
{
	  static void d()
	{
		    int i =10;
		System.out.print(i);
	}
}
 class A2 extends A1
 {
	  static void d1()
	 {
		 int j=20;
		 System.out.println(j);
	 }
	 
 }

public class static_exx {
	public static void main(String[] args) 
	{
		A2.d1();
		A2.d();
	}

}
