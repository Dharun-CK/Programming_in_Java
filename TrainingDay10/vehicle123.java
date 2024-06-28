 class Vehicle
{
	void drive() {
		System.out.println("DRIVE");
	}
}

class car extends Vehicle
{
	void drive()
	{
		System.out.println("Repairing a car!!!!!");
	}
}

public class vehicle123 {
public static void main(String[] args)
{
	car c = new car();
	c.drive();
}
}
