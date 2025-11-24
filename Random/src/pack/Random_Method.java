package pack;

import java.util.Random;
import javax.swing.JOptionPane;

public class Random_Method {
	public static void main(String[] args) {
		Random random = new Random();
		
		int a = random.nextInt(11);
		double b = random.nextDouble(10) + 1;
		boolean c = random.nextBoolean();
		
		JOptionPane.showMessageDialog(null, String.format("Random of a integer: %d", a));
		JOptionPane.showMessageDialog(null, String.format("Random of a double: %.02f", b));
		JOptionPane.showMessageDialog(null, String.format("Random of a boolean: %b", c));
	}
}
