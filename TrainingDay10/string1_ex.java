import java.util.*;
public class string1_ex
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	String str = new  String();
	String str1 = new  String();
	String sub = str.Subtring();
	str=sc.next();
	str1=sc.next();
	if((str.length())==(str1.length()))
	{
		System.out.println("Same");
	}
	else
	{ 
		System.out.println("Not same");
	}
}
}