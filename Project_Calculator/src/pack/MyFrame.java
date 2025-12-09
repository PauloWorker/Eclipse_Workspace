package pack;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	
	JTextField text;
	JButton button;
	JLabel l_result;
	
	MyFrame()
	{
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
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(800, 640);
		
		this.add(text);
		this.add(button);
		this.add(l_result);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button)
		{
			//l_result.setText(text.getText());
			Calculate();
		}
	}
	
	public void Calculate()
	{
		String[] str = text.getText().split("");
		String all = "";
		
		for(String s : str)
		{
			all += s.trim() + ", ";
			System.out.println(s);
		}
		
		
		l_result.setText(all);
	}
}
