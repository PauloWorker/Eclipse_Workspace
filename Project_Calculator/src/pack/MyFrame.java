package pack;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	
	JTextField text;
	JButton button;
	JButton[] signsButton = {
			new JButton("+"), 
			new JButton("-"), 
			new JButton("*"), 
			new JButton("/")
			};
	JButton[] digits = {
			new JButton("0"), new JButton("1"), new JButton("2"),
			new JButton("3"), new JButton("4"), new JButton("5"),
			new JButton("6"), new JButton("7"), new JButton("8"),
			new JButton("9")
			};
	JPanel panel;
	JLabel l_result;
	
	MyFrame()
	{
		panel = new JPanel();
		
		text = new JTextField();
		text.setBounds(250, 10, 300, 30);
		text.setFont(new Font("Open Sans", Font.BOLD, 20));
		text.setText("0");
		//text.setHorizontalAlignment(JTextField.RIGHT);
		
		l_result = new JLabel();
		l_result.setText("Result");
		l_result.setBounds(350, 80, 100, 20);
		l_result.setHorizontalAlignment(JLabel.CENTER);
		l_result.setVisible(true);
		
		button = new JButton("Calculate");
		button.setBounds(350, 50, 100, 20);
		button.addActionListener(this);
		
		signsButton[0].setBounds(300, 110, 45, 30);
		signsButton[0].addActionListener(this);
		
		signsButton[1].setBounds(350, 110, 45, 30);
		signsButton[1].addActionListener(this);
		
		signsButton[2].setBounds(400, 110, 45, 30);
		signsButton[2].addActionListener(this);
		
		signsButton[3].setBounds(450, 110, 45, 30);
		signsButton[3].addActionListener(this);
		
		for(JButton digit : digits)
		{
			
		}
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(800, 640);
		
		this.add(text);
		this.add(button);
		this.add(signsButton[0]);
		this.add(signsButton[1]);
		this.add(signsButton[2]);
		this.add(signsButton[3]);
		this.add(l_result);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button)
		{
			//l_result.setText(text.getText());
			Calculate();
		}
		
		//if(e.getSource() == signsButton[0])
		//{
			//text.setText(text.getText() + "+");
		//}
		
		for(int i = 0; i < signsButton.length; i++)
		{
			if(e.getSource() == signsButton[i])
			{
				text.setText(text.getText() + i);
			}
		}
	}
	
	public void Calculate()
	{
		String[] str = text.getText().split("\\+");
		String all = "";
		int r = 0;
		
		for(String s : str)
		{
			all += s.trim() + ", ";
			
			r += Integer.parseInt(s);
			System.out.println(s);
		}
		
		
		l_result.setText("" + r);
	}
}
