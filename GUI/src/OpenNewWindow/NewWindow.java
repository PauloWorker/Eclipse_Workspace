package OpenNewWindow;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	
	NewWindow()
	{
		label.setBounds(0, 0, 100, 15);
		label.setFont(new Font(null, Font.PLAIN, 15));
		label.setText("Welcome");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 640);
		frame.setLayout(null);
		frame.setVisible(true);
		
		frame.add(label);
	}
}
