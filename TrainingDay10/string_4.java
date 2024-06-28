import java.util.*;
public class string_4 
{
	public static void main(String[] args) // 1st non-repeating character
	{
	Scanner sc = new Scanner(System.in);
	String str = new String();
	str = sc.nextLine();
	int a = str.length();
	int b=0;
	int c=5;
	for(int i=0;i<a/5;i++)
	{
	String sub =str.substring(b,c);
	b+=5;
	c+=5;
	System.out.println(sub);
	}
	}
}