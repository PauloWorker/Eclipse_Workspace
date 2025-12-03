package JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		ImageIcon image = new ImageIcon("src/image1.png");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		JLabel label = new JLabel(); //Create a label
		label.setText("Do you even code?");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text on the LEFT, CENTER, RIGHT of Image Icon
		label.setVerticalTextPosition(JLabel.TOP); // set text on the TOP, CENTER, BOTTOM of Image Icon
		label.setForeground(new Color(0xA0A0A0)); //Set the color
		label.setFont(new Font("MV Boli", Font.BOLD, 20)); //set the font family, font style and size
		label.setIconTextGap(-25); //set gap between the Text and the Image
		label.setBackground(Color.black); //set background color
		label.setOpaque(true); //display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); //Set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); //Set horizontal position of icon+text within label
		//label.setBounds(100, 100, 500, 500); //set the x, y, width, height within frame
		
		frame.setTitle("JLabel"); //sets title of this
		frame.setSize(800, 640); //sets the x-dimension and y-dimension of this
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application, always put this code to close the application instead of hide the window when click in 'x' button to close
		//frame.setLayout(null); //set the label to not use the entire windows of the frame
		frame.setVisible(true);
		frame.add(label);
		
	}
}
