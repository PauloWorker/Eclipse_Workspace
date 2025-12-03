package Panels;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class Main {
	public static void main(String[] args) {
		
		//JPanel =  A gui GUI component that functions as a container to hold other components
		
		JFrame frame = new JFrame();
		
		////////////////////////// Labels ///////////////////////////////////
		JLabel label = new JLabel();
		label.setText("Panel Red");
		label.setFont(new Font("MV Boli", Font.BOLD, 20));
		//label.setVerticalAlignment(JLabel.CENTER);
		//label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(0, 0, 100, 50);
		
		////////////////////////// Panels ///////////////////////////////////
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setLayout(null);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setLayout(null);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout());
		
		//////////////////////////  ////////////////////////////////////////
		
		frame.setTitle("JPanel"); //sets title of this
		frame.setSize(800, 640); //sets the x-dimension and y-dimension of this
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application, always put this code to close the application instead of hide the window when click in 'x' button to close
		frame.setLayout(null); //set the label to not use the entire windows of the frame
		frame.setVisible(true);
		
		frame.add(redPanel);
		redPanel.add(label);
		
		frame.add(bluePanel);
		frame.add(greenPanel);
	}
}
