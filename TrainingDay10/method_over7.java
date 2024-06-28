import java.util.*;
class Person
{
	void FirstName(String a){
		System.out.printf("\nFull name:%s",a);
	}
	void LastName(String b)
	{
		System.out.printf("\nLastttt Name:%s",b);
	}
}
class Employee extends Person
{
	void Employee_id(int i){
		System.out.printf("\nEmp_id:%d",i);
	}
	void LastName(String a,String b)
	{
		System.out.printf("\n Name:%s",a+b);
	}
	void job(String b) {
		System.out.printf("\n the Job:%s",b);
	}
	
}
public class method_over7 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String a=new String();
String b=new String();
String c=new String();
System.out.println("Enter 1st Name:");
a=s.next();
System.out.println("Enter last Name:");
b=s.next();
System.out.println("emp ID:");
int d=s.nextInt();

System.out.println("Enter job");
c=s.next();
Employee w = new Employee();
w.LastName(b);
w.Employee_id(d);
w.LastName(a,b);
w.job( c);
}
}
