package ArrayList_Of_Object;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<>();
		
		cars.add(new Car("Fiat", "Cronos", 2004));
		cars.add(new Car("Tesla", "Truck", 2045));
		cars.add(new Car("Ford", "Ka", 2006));
		
		for(int i = 0; i < cars.size(); i++)
		{
			System.out.println(cars.get(i).make);
		}
	}
}
