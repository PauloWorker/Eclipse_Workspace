package Jframe_gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame()
	{		
		ImageIcon image = new ImageIcon("src/logo.jpg"); //create a image icon
		
		this.setTitle("JFrame titles goes here"); //sets title of this
		this.setSize(420, 420); //sets the x-dimension and y-dimension of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application, always put this code to close the application instead of hide the window when click in 'x' button to close
		this.setResizable(false); //prevent to resize the this
		this.setVisible(true); //make the this window visible
		this.setIconImage(image.getImage()); //change the icon image
		this.getContentPane().setBackground(new Color(0, 0, 255)); //change the background color
	}
}
