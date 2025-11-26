package Dynamic_Polymorphism;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		// Polymorphism = Greek word for "poly"-"many" and "morph"-"form"
		// 				  The ability of an object to identify as more than one type
	
		int option = Integer.parseInt(JOptionPane.showInputDialog("Choose a option:\nType 1 to Car\nType 2 to Bicycle\nType 3 to Boat\nType here:"));
		
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		switch(option)
		{
			case 1:
				JOptionPane.showMessageDialog(null, car.select());
				break;
				
			case 2:
				JOptionPane.showMessageDialog(null, bicycle.select());
				break;
				
			case 3:
				JOptionPane.showMessageDialog(null, boat.select());
				break;
				
			default:
				JOptionPane.showMessageDialog(null, vehicle.select());
				break;
		}
		
	}
}
