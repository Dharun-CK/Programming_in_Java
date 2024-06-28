class annim
{
	void makes()
	{
		System.out.println("Roar");
	}
}

class Cat extends annim
{
	void makes()
	{
	System.out.print("Bark");	
	}
}
public class train_7624 {
public static void main(String[] args)
{
Cat c =new Cat();
c.makes();
}
}
