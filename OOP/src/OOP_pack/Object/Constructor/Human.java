package OOP_pack.Object.Constructor;

public class Human {
	String name;
	int age;
	double weight;
	
	public Human(String name, int age, double weight) //The constructor is used to assign the values in the parameters to the object
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void Info()
	{
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Weight: " + this.weight + "kg");
	}
}
