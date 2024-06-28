import java.util.*;
public class binary_s 
{
	public static void main(String[] args)
	{
		int i;  //k-key
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int k = sc.nextInt();
		 int[]arr=new int[a];
		for (i = 0; i<a; i++)
		{
			arr[i]=sc.nextInt();
		}
		 int f=0;int la=a-1;int m;
		 while(f<=la)
		 {
			 m=(f+la)/2;
			 if(arr[m]==k)
				 break;
			 else
			 {
				if(arr[m]<k)
					f=m+1;
				else
					la=m-1;
			 }
		 }
		 if(f<=la)
			 System.out.print("FOUND");
		 else
			 System.out.println("NOT FOUND");
			 
	}
}