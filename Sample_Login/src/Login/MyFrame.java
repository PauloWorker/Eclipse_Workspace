package Login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	
	JLabel login_label = new JLabel("Login");
	JLabel password_label = new JLabel("Password");
	JLabel message_label = new JLabel();
	
	JTextField login_field = new JTextField();
	JTextField password_field = new JTextField();
	
	private String username = "TechWorld123";
	private String password = "123456";
	
	MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setResizable(false);
		this.setSize(640, 320);
		this.setLayout(null);
		this.setVisible(true);
		
		this.add(login_label);
		this.add(login_field);
		this.add(password_label);
		this.add(password_field);
		this.add(message_label);
		
		login_field.addActionListener(this);
		password_field.addActionListener(this);
		
		login_label.setBounds(290, 10, 100, 30);
		login_label.setFont(new Font("MV Boli", Font.BOLD, 25));
		
		login_field.setBounds(230, 40, 200, 30);
		login_field.setFont(new Font("MV Boli", Font.BOLD, 21));
		
		password_label.setBounds(270, 80, 150, 30);
		password_label.setFont(new Font("MV Boli", Font.BOLD, 25));
		
		password_field.setBounds(230, 110, 200, 30);
		password_field.setFont(new Font("MV Boli", Font.BOLD, 21));
		
		message_label.setBounds(170, 160, 450, 30);
		message_label.setHorizontalTextPosition(JLabel.CENTER);
		message_label.setFont(new Font("MV Boli", Font.BOLD, 25));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == login_field || e.getSource() == password_field)
		{
			if(login_field.getText() != username && password_field.getText() != password)
			{
				message_label.setText("Username and Password incorrect");
				message_label.setForeground(Color.red);
			}
			else
			{
				message_label.setText("Username and Password correct");
				message_label.setForeground(Color.green);
			}
		}
		
	}
}
