import java.util.*;
public class testdaily11_6 {
		public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] str= s.nextLine().split(" "); 
		Stack<Character> ab= new Stack<>();
		int c =0;
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length();j++) {
			char a = str[i].charAt(j);
			ab.push(a);
			c+=1;
			}
		}
		for(int i=0;i<c;i++) {
		
			System.out.print(ab.pop());
		}
	}
	}
