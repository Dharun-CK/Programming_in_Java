import java.util.*;
public class arraylistex {
public static void main(String[] args) {
		List<Character> a1= new ArrayList<>();
		a1.add('C');
		a1.add('K');
		a1.add('D');
		a1.add('H');
		a1.add('C');
		System.out.println(a1);
		Set<Character> s1 =new HashSet<>();
		s1.addAll(a1);
		System.out.println(s1);
		
	}
	}

