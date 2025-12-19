package Login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Register extends JFrame implements ActionListener {
	
	JLabel login_label = new JLabel("Login");
	JLabel password_label = new JLabel("Password");
	JLabel confPassword_label = new JLabel("Confirm Password");
	JLabel message_label = new JLabel();
	
	JTextField login_field = new JTextField();
	JTextField password_field = new JTextField();
	JTextField confPassword_field = new JTextField();
	
	private String username = "TechWorld123";
	private String password = "abcdef";
	
	Register()
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
		this.add(confPassword_label);
		this.add(confPassword_field);
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
		
		confPassword_label.setBounds(230, 150, 200, 30);
		confPassword_label.setFont(new Font("MV Boli", Font.BOLD, 21));
		
		confPassword_field.setBounds(230, 180, 200, 30);
		confPassword_field.setFont(new Font("MV Boli", Font.BOLD, 21));
		
		message_label.setBounds(170, 220, 450, 30);
		message_label.setHorizontalTextPosition(JLabel.CENTER);
		message_label.setFont(new Font("MV Boli", Font.BOLD, 25));
		
		System.out.println(password_field.getText().equals(password));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == login_field || e.getSource() == password_field)
		{
			
			String user = login_field.getText().trim();
			String pass = password_field.getText().trim();
			String conf_pass = confPassword_field.getText().trim();
			
			if(user.isEmpty() || pass.isEmpty() && conf_pass.isEmpty())
			{
				message_label.setText("The spaces are blank");
				message_label.setForeground(Color.red);
			}
			else if(!user.isEmpty() || !pass.equals(conf_pass))
			{
				message_label.setText("The passwords don't match");
				message_label.setForeground(Color.red);
			}
			else if(!user.isEmpty() && pass.equals(conf_pass))
			{
				message_label.setText("Registred");
				message_label.setForeground(Color.green);
			}
			
			
			Path path = Path.of("src/credentials.txt");
			
			try {
				if(Files.notExists(path))
				{
					Files.createFile(path);
				}
			}
			catch(IOException e1)
			{
				e1.printStackTrace();
			}
			
			//File file = new File();
			//FileWriter fileWriter = new FileWriter(file);
		}
		
	}
}
