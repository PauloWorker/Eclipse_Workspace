package pack;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		//Exception =  an event that occurs during the execution of a program, 
		//			   that disrupts the normal flow of instructions.
		
		int num1;
		int num2;
		int result = 0;
		
		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to divide by:"));
			result = num1 / num2;
		}
		catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "You can't divide by zero, you smart");
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "You need to enter a number not a text, dumb!");
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Something went wrong in your code!");
		}
		finally { //Always will print
			JOptionPane.showMessageDialog(null, "Result: " + result);
		}
		
	}
}
