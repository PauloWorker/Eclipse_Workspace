package Copy_Objects;

public class Main {
	public static void main(String[] args) {
		
		// car2 = car1 -> it's not the right way to make a copy from a object to another because they will change
		//				  just the memory address and will appoint to the values from the address.
		
		Car car1 = new Car("Fiat", "Cronos", 2017);
		Car car2 = new Car("Ford", "Ka", 2014);
		
		car2.copy(car1);
		
		System.out.println(car1); //Memory Address
		System.out.println(car2); //Memory Address
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
	}
}
