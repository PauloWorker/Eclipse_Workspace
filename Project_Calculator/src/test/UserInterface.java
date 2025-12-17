package test;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserInterface extends JFrame implements ActionListener{

	JPanel panel = new JPanel();
	
	JTextField display = new JTextField("0");
	
	JButton[] num_buttons = {
			new JButton("1"), new JButton("2"), new JButton("3"),
			new JButton("4"), new JButton("5"), new JButton("6"),
			new JButton("7"), new JButton("8"), new JButton("9"),
			new JButton("0")
			};
	
	JButton[] sign_buttons = {
			new JButton("+"), new JButton("-"), new JButton("*"),
			new JButton("/")
			};
	
	String n = "0"; //value to the display
	
	UserInterface()
	{
		// --- JFrame --- //
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLayout(null);
		this.setSize(320, 480);

		//numpad
		for(JButton num_button : num_buttons)
		{
			num_button.setFocusable(false);
			num_button.setFont(new Font("Geom", Font.BOLD, 15));
			num_button.addActionListener(this);
			
			panel.add(num_button);
		}
		
		//signals
		for(JButton sign_button : sign_buttons)
		{
			sign_button.setFocusable(false);
			sign_button.setFont(new Font("Geom", Font.BOLD, 15));
			sign_button.addActionListener(this);
			
			panel.add(sign_button);
		}
		
		this.add(display);
		this.add(panel);
		
		// --- Interface --- //
		display.setBounds(80, 5, 160, 36);
		display.setFont(new Font("Geom", Font.BOLD, 25));

		panel.setBounds(80, 40, 160, 175);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Function to the numpad
		for(JButton num_button : num_buttons)
		{
			if(e.getSource() == num_button)
			{
				//If else to not add the number 0 on front the another
				if(num_button.getText() != "0") 
				{
					if(n != "0")
					{
						n += Integer.parseInt(num_button.getText()); //Add a number, case if isn't 0 
					}
					else
					{
						n = (num_button.getText());
					}
				}
				else
				{
					if(n != "0")
					{
						n += Integer.parseInt(num_button.getText());
					}
					else
					{
						n = "0";
					}
				}
			
				
				System.out.println(n);
			}
		}
		
		for(JButton sign_button : sign_buttons)
		{
			
			if(e.getSource() == sign_button)
			{				
				if(lastCharAt(n) != '+' && lastCharAt(n) != '-' && lastCharAt(n) != '*' && lastCharAt(n) != '/') //Prevent to add a new sign after another
				{
					n += sign_button.getText();
				}
			}
		}
		
		display.setText("" + n);
	}
	
	char lastCharAt(String s)
	{
		int lastIndex = s.length() - 1;
		return s.charAt(lastIndex);
	}
}