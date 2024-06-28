import java.util.*;
public class string_2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = new String();
	str = sc.nextLine();

	int a= str.length();
	System.out.println(a);
	int b= a/2;
	for(int i =0;i<b;i+=1)
	{
		char ac = str.charAt(i);
		System.out.print(ac);
		for(int j=i+1;i<=b;j+=1)
		{
			char as= str.charAt(j);
			System.out.println(as);
		}

	}
	
}
}
