package CheckBox;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JTextField textField;
	JCheckBox checkBox;
	ImageIcon icon_correct = new ImageIcon("src/correct_icon.png");
	ImageIcon icon_incorrect = new ImageIcon("src/incorrect_icon.png");
	
	MyFrame()
	{
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Arial", Font.PLAIN, 21));
		checkBox.setIcon(icon_incorrect);
		checkBox.setSelectedIcon(icon_correct);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setSize(800, 640);
		
		this.add(checkBox);
		this.add(button);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button)
		{
			System.out.println(checkBox.isSelected());
		}
		
	}
}
