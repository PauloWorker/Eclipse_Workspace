package pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test extends JFrame implements ActionListener {
	
	JTextField field = new JTextField();
	JLabel label = new JLabel();
	
	Test()
	{
		this.setTitle("Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLayout(null);
		this.setSize(800, 600);
		this.setVisible(true);
		this.add(field);
		this.add(label);
		
		field.addActionListener(this);
		
		field.setBounds(0, 0, 200, 50);
		
		label.setBounds(0, 60, 200, 50);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == field)
		{
			label.setText(field.getText());
		}
		
	}
}
