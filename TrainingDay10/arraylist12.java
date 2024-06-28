import java.util.*;
public class arraylist12 {
public static void main(String[] args) {
			List<Character> a1= new ArrayList<>();
			List<Character> a2= new ArrayList<>();
			Scanner s = new Scanner(System.in);
			for(int i=0;i<=10;i++) 
			{
			char a = s.next().charAt(0);			
			/*a1.add('C');
			a1.add('K');
			a1.add('D');
			a1.add('H');
			a1.add('1');
			a1.add('4');
			a1.add('6');
			a1.add('8');
			a1.add('1');*/
			a1.add(a);
			}
			System.out.println(a1+"");
			/*Set<Character> s1 =new HashSet<>();
			s1.addAll(a1);
			System.out.println(s1);
			*/
			  for(int i=0;i<=a1.size()-1;i++) {
				  for(int j =i+1;j<a1.size();j++)
				  {
					  if(a1.get(i)== a1.get(j)) {
						  a1.remove(j);
					  }
				  }
			  }
			  System.out.println(a1);
			
			
		}
}