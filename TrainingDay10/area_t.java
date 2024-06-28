import java.util.*;
class shape
{

}
class area extends shape
{

	float i = 1/3;	
}
class rectangle extends area
{
	void area(int x,int y)
	{
		System.out.printf("The area is %.0f",(float)i*x*y);
	}
}


public class area_t {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	rectangle r= new rectangle();
	r.area(a,b);
}
}
