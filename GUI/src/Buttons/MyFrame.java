package Buttons;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	
	MyFrame()
	{
		button = new JButton();
		button.setBounds(200, 100, 100, 50);
		button.addActionListener(this);
		button.setText("Button");
		button.setFocusable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(800, 640);
		
		this.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Here is the code that will be performed after the button has been clicked
		
		if(e.getSource() == button) {
			JOptionPane.showMessageDialog(null, "The button has been clicked");
		}
	}
}
