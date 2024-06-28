import java.util.*;
public class string_c {
public static void main(String[] args) {
	Stack<Integer>ar = new Stack<>();
	//Stack<Integer>ar1 = new Stack<>();
	Scanner s = new Scanner(System.in);
int a = s.nextInt();
int max =Integer.MAX_VALUE;
int min =Integer.MIN_VALUE;
for(int i = 0 ;i<a;i++)
	{
	ar.push(s.nextInt());
	}

for(int i =0;i<a;i++)
{
	if(ar.peek()>max)
	{
		max = ar.peek();
	}
	else if(ar.peek()<min)
	{
		min = ar.peek();
	}
	ar.pop();
}


System.out.println("MAX:"+max);
System.out.println("MIN:"+min);
}
}
