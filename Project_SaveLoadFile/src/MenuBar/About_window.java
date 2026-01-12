package MenuBar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class About_window extends JFrame{
	
	int width = 400; //Width of the window
	int height = 240; //Height of the window
	
	String html = "<html>"
				+ "<h1>Welcome to my test project!</h1>"
				+ "<font size='4'>"
				+ "<p>"
				+ "This project was developed to put in practing"
				+ "</p>"
				+ "<p>"
				+ "all the classes of the Java Course"
				+ "</p>"
				+ "<p>"
				+ "and as the results of my efforts,"
				+ "</p>"
				+ "<p>"
				+ "it has been possible thanks about the course"
				+ "</p>"
				+ "<p>"
				+ "and the good content of each class."
				+ "</p>"
				+ "<p>"
				+ "Thanks for read!"
				+ "</p>"
				+ "<p>"
				+ "© Paulo Ribeiro, 2026"
				+ "</p>"
				+ "</font>"
				+ "</html>";
	
	JLabel label = new JLabel();
	
	About_window()
	{
		this.setTitle("About us");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(width, height);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.add(label);
		
		label.setText(html);
	}
}
