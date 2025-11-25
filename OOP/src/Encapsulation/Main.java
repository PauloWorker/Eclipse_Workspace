package Encapsulation;

public class Main {
	public static void main(String[] args) {
		Car car = new Car("Fiat", "Cronos", 2017);
		car.setMake("BMW");
		
		System.out.println(car.getMake());
	}
}
