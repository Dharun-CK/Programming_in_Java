import java.util.*;
public class dailyT {
	  public static void main(String[]args)
	  {
	    Scanner s = new Scanner(System.in);
	    int a = s.nextInt();
	    int c;
	    int[]arr=new int[a];
	    for(int i=0;i<a;i++)
	    {
	      arr[i]=s.nextInt();
	    }
	    int min =100000;
	  Arrays.sort(arr);
	    for(int i=a;i>=0;i--)
	    {
	    	c= arr[i]-arr[i-1];
	    	if(c<min) {
	    		min =c;
	    	}
	    }
	    System.out.print(min);
	    
	  }
	  }