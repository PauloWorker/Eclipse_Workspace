package Buttons;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
	
	MyFrame()
	{
		button = new JButton();
		label = new JLabel();
		
		ImageIcon icon = new ImageIcon("src/check_icon.png");
		
		button.setBounds(200, 100, 130, 90);
		button.addActionListener(this);
		button.setText("Button");
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFocusable(false);
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setIconTextGap(-15);
		button.setForeground(Color.BLUE);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		label.setBounds(237, 200, 42, 42);
		label.setIcon(icon);
		label.setVisible(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(800, 640);
		
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Here is the code that will be performed after the button has been clicked
		
		if(e.getSource() == button) {
			JOptionPane.showMessageDialog(null, "The button has been clicked");
			button.setEnabled(false); //set the button to not be able to be used
			label.setVisible(true);
		}
	}
}
