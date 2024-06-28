import java.util.*;
public class string_6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = new String();
		str = s.nextLine();
		str=(str);
		char c[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
			c[i]=str.charAt(i);
		
		
		/*String[] things= {"hi","Hello","GooooD","MORningggggg"};
		for(String x:things) 
		{
		System.out.println(x.indexOf(2));
		System.out.println(things.length);
		}*/
		for(int i=0;i<str.length();i++)
		{
			System.out.println(c[i]);
		}	
	}
}