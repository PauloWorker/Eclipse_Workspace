package Super_keyword;

public class Hero extends Person {
	String power;
	
	Hero(String name, int age, String power)
	{
		super(name, age);
		this.power = power;
	}
	
	public String toString()
	{
		return String.format("Name: %s\nAge: %d\nPower: %s", this.name, this.age, power);
	}
}
