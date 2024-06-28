import java.util.*;

class GF
{
	void GF1()
	{
		System.out.println("   GRAND FATHER");
	}
}

class F extends GF
{
	void F1()
	{
		System.out.println(" FATHER");
	}
}

class S extends F
{
	void S1()
	{
		System.out.println(" SON");
	}
}
class D extends F
{
	void D1() {
		System.out.println("DAUGHTER");
	}
}
class GS extends S
{
	void GS1()
	{
		System.out.println("GRAND SON");
	}
}
class GD extends S
{
	void GD1()
	{
		System.out.println("GRAND DAUGHTER");
	}
}


public class M_H
{
	public static void main(String[] args) {
		GD gd1=new GD();
		gd1.GD1();
		gd1.S1();
		gd1.F1();
		gd1.GF1();
		GS gs1 = new GS();
		gs1.GS1();
		gs1.S1();
		gs1.F1();
		gs1.GF1();
		
		
	
	}
}