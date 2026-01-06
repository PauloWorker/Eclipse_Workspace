package scripts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

	Cronometer panel = new Cronometer();
	
	MyFrame()
	{
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.pack();
		this.setVisible(true);
		this.setSize(640, 480);
		this.add(panel);
	}
	
}
