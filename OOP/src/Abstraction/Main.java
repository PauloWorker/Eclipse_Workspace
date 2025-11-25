package Abstraction;

public class Main {
	public static void main(String[] args) {
		
		// abstract =  abstract classes cannot be instantiated, but they can have a subclass
		// 			   abstract methods are declared without an implementation
		//             abstract also is a way to add more security to the code
		// 			   a analogy about the main idea is to how to use the car without to know how the engine works
		
		//Vehicle vehicle = new Vehicle(); Cannot be instantiated
		Car car = new Car();
		
		car.go();
		car.stop();
	}
}
