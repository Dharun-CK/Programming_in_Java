import java.util.*;
class Detail
	{
	int roll;
	String name;
	int year;
	String dept;      

	void student()
      {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter name:");
		name = sc.nextLine();
		System.out.print("Enter dept:");
		dept = sc.nextLine();
		System.out.print("Enter rollno:");
		roll= sc.nextInt();
	   System.out.print("Enter Year:");
	   year = sc.nextInt();
	   }
      
       int display()
      {
    	  System.out.println("****************************************************************");
    	  System.out.println("REG NO: "+roll);
    	  System.out.println("NAME: "+name);
    	  System.out.println("DEPT: "+dept);
    	  System.out.println("YEAR: "+year);
    	  System.out.println("****************************************************************");   	
    	  return 0;
      }
      
	}


public class oops1
{
	
	public static void main(String[]args) 
    {
	Detail d = new Detail();
    d.student();
	d.display();
	d.student();
	d.display();
	}

}

