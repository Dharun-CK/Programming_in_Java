import java.util.*;
public class Armstrong 
{
public static void main(String[] args)
	{
      Scanner s= new Scanner(System.in);
      int a = s.nextInt();
      for(int i=a;i>=1;i-=1)
      {
    	  for(int j=1;j<=i;j++)
    	  {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
      for(int k=1;k<=a;k++)
     {
       for(int l=1;l<=k;l++)
    	  {
    	System.out.print("*");
    	  }
     System.out.println();
      }
      for(int c=1;c<=a;c++)
      {
        for(int d=1;d<=a;d++)
     	  {
     	  System.out.print("*");
     	  }
      System.out.println();
       }
	}		
}