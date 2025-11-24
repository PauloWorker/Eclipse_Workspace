package Pack;

import javax.swing.JOptionPane;

public class Calculator {
	public static void main(String[] args) {
		int option = 0;
		double a = 0;
		double b = 0;
		double area = 0;
		
		do {
			option = Integer.parseInt(JOptionPane.showInputDialog("Choose one of the options:\nType 1 to square\nType 2 to retangular\nType 3 to circle\nType 4 to triangule\nType 0 to cancel"));
			
			switch(option)
			{
				case 1: //Square
					a = Double.parseDouble(JOptionPane.showInputDialog("Type the size of the Square: "));
					area = square(a);
					break;
					
				case 2: //Retangular
					a = Double.parseDouble(JOptionPane.showInputDialog("Type the height of the Retangular: "));
					b = Double.parseDouble(JOptionPane.showInputDialog("Type the base of the Retangular: "));
					area = retangular(a, b);
					break;
					
				case 3: //Circle
					a = Double.parseDouble(JOptionPane.showInputDialog("Type the ray of the circle: "));
					area = circle(a);
					break;
					
				case 4: //Triangle
					a = Double.parseDouble(JOptionPane.showInputDialog("Type the height of the Triangle: "));
					b = Double.parseDouble(JOptionPane.showInputDialog("Type the base of the Triangle: "));
					area = triangle(a, b);
					break;
					
				case 0: //Close
					JOptionPane.showMessageDialog(null, "The program will be closed");
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "The program will be closed");
					break;
			}
			
			if(option > 0 && option < 5)
			{
				JOptionPane.showMessageDialog(null, String.format("Area: %.02f", area));
			}
			
		} while(option > 0 && option < 5);
	}
	
	static double square(double a)
	{
		return a * a;
	}
	
	static double retangular(double a, double b)
	{
		return a * b;
	}
	
	static double circle(double r)
	{
		final double PI = 3.1415;
		return PI * (r * r);
	}
	
	static double triangle(double b, double h)
	{
		return (b * h) / 2;
	}
}
