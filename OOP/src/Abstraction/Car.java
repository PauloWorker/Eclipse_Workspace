package Abstraction;

public class Car extends Vehicle{
	@Override
	void go()
	{
		System.out.println("The Driver is driving the car");
	}
	
	@Override
	void stop()
	{
		System.out.println("The Driver is stoping the car");
	}
}
