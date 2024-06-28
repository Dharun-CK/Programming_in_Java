import java.util.*;
public class duplicate_arry1 {
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	int []a = new int[10];
	int hash[]=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	 for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" "); 
	}
	for(int i =0;i<a.length;i++)
	{
		for(int j=0;j<hash.length-1;j++)
		{
			hash[j]=a[i];
			hash[j]=+1;
			
			if(j=='1')
			{
				System.out.println(j);
			}
	
		}
		
	}
}
}
