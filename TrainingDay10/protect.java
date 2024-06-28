
  class dExam 
{
	  protected  void display()
	{
		System.out.println("HIIIIIIIIIIIIIIIIIIII");
		
		ab();
	}
	  private void ab() 
	  {
		  System.out.print("PRIVATEEEEEEEEEE");
		  System.out.println();
		  
	  }
	  void d()
	  {
		  System.out.println("BYEEEEEEEEEEEEEEEEE");
	  }
}
  
  class e extends dExam
  {
	  
  }
  
public class protect {
public static void main(String[] args) {
	e ed = new e();
	ed.display();
    ed.d();
}
}
