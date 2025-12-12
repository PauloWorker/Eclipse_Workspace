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
	
	UserInterface()
	{
		// --- JFrame --- //
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLayout(null);
		this.setSize(320, 480);

		for(JButton num_button : num_buttons)
		{
			num_button.setFocusable(false);
			num_button.setFont(new Font("Geom", Font.BOLD, 15));
			num_button.addActionListener(this);
			
			panel.add(num_button);
		}
		
		this.add(display);
		this.add(panel);
		
		// --- Interface --- //
		display.setBounds(80, 5, 160, 36);
		display.setFont(new Font("Geom", Font.BOLD, 25));

		panel.setBounds(80, 40, 160, 160);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int n = 0;
		
		for(JButton num_button : num_buttons)
		{
			if(e.getSource() == num_button)
			{
				
				n += Integer.parseInt(num_button.getText());
				display.setText("" + n);
			}
		}
	}

}
