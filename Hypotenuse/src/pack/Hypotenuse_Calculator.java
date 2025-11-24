package pack;

import javax.swing.JOptionPane;

public class Hypotenuse_Calculator {
	public static void main(String[] args) {
		double h = 0, ca = 0, co = 0;
		
		ca = Double.parseDouble(JOptionPane.showInputDialog("Enter the Adjacent"));
		co = Double.parseDouble(JOptionPane.showInputDialog("Enter the Oppositive"));
		
		h = Math.sqrt((ca * ca) + (co * co));
		
		JOptionPane.showMessageDialog(null, String.format("The hypotenuse is: %.02f", h));
	}
}
