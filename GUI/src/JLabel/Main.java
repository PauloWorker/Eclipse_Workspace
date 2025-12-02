package JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		ImageIcon image = new ImageIcon("src/image1.png");
		
		JLabel label = new JLabel(); //Create a label
		label.setText("Do you even code?");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text on the LEFT, CENTER, RIGHT of Image Icon
		label.setVerticalTextPosition(JLabel.TOP); // set text on the TOP, CENTER, BOTTOM of Image Icon
		label.setForeground(new Color(0xA0A0A0)); //Set the color
		label.setFont(new Font("MV Boli", Font.BOLD, 20)); //set the font family, font style and size
		label.setIconTextGap(100); //set gap between the Text and the Image
		
		frame.setTitle("JLabel"); //sets title of this
		frame.setSize(420, 420); //sets the x-dimension and y-dimension of this
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application, always put this code to close the application instead of hide the window when click in 'x' button to close
		frame.setVisible(true);
		frame.add(label);
		
	}
}
