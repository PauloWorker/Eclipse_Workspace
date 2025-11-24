package gui;

import javax.swing.JOptionPane;

public class GUI_Class {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight"));
		
		JOptionPane.showMessageDialog(null, "Name: " + name);
		JOptionPane.showMessageDialog(null, "Age: " + age);
		JOptionPane.showMessageDialog(null, "Weight: " + weight);
	}
}
