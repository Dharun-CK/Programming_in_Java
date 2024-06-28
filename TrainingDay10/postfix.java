import java.util.*;
public class postfix {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			Stack<String> s=new Stack<>();
			s.push("$");
			int sum=0;
			String op="+-*/";
			String hp="*/";
			String in[]=sc.nextLine().split(" ");
			String po="";
			for(int i=0;i<in.length;i++)
			{
				if(op.contains(in[i]))
				{
				
					if(s.peek().equals("$"))
					{
						
							s.push(in[i]);
			
					}
				else
					{
						if(s.peek().equals("*")||s.peek().equals("/"))
						{
							po+=s.peek()+" ";
							
							s.pop();
							s.push(in[i]);
						}
						else	
							s.push(in[i]);
					}
				}
				else if(in[i].equals("("))
				{
					s.push(in[i]);
				}
				else if(in[i].equals(")"))
				{
					int f=0;
					while(f!=1)
					{
						if(s.peek().equals("("))
						{
							s.pop();
							f=1;
							break;
						}
						else
						{
							po+=s.pop()+" ";
						}
					}
				}
				else{
					po+=in[i]+" ";
					
				}
			}
			int f=0;
			while(f!=1)
			{
				if(s.peek().equals("$"))
				{
					f=1;
					break;
				}
				else
				{	po+=s.peek()+" ";
					
					s.pop();
				}
			}
			System.out.print("postfix expression: "+po);
		String[] p=po.split(" ");
		for(int i=0;i<p.length;i++)
		{
			if(op.contains(p[i]))
			{
				int n2=Integer.parseInt(s.pop());
				int n1=Integer.parseInt(s.pop());
				char c=p[i].charAt(0);
				switch(c)
				{
				case '+':
				{
					sum=n1+n2;
					String s1=""+sum;
					s.push(s1);
					break;
				}
				case '*':
				{
					sum=n1*n2;
					String s1=""+sum;
					s.push(s1);
					break;
				}
				case '/':
				{
					sum=n1/n2;
					String s1=""+sum;
					s.push(s1);
					break;
				}
				case '-':
				{
					sum=n1-n2;
					
					String s1=""+sum;
					s.push(s1);
					break;
				}
				
				}
			}
			else
			{
				s.push(p[i]);
			}
		}
		System.out.println("\nANSWER:"+s.pop());
	}
	}
