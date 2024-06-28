import java.util.*;
	
public class special 
{
	public static void main(String[]args)
	  {
	    Scanner s = new Scanner(System.in);
	    char arr[]=new char[40];
	    int c=0;
	    for(int i=0;i<5;i++)
	    {
	    arr[i]=s.next().charAt(0);
	    }
	    
	    for(char x: arr)
	    {
	    if(x =='@'||x=='#'||x=='$'||x =='%')
	    c=c+1;
	    }
	    System.out.print("count of spl char"+c);  
	  }
}