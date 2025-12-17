package SelectColor;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton button = new JButton("Select Color");
	JLabel label = new JLabel();
	
	MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.pack();
		this.setLayout(new FlowLayout());
		this.setSize(1000, 320);
		this.setVisible(true);
		
		label.setText("Current Color");
		label.setBackground(Color.WHITE);
		label.setOpaque(true);
		label.setFont(new Font("MB Boli", Font.BOLD, 50));
		
		button.setBounds(0, 0, 200, 50);
		button.addActionListener(this);
		
		this.add(button);
		this.add(label);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button)
		{
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
			
			if(color.getRed() > 253 && color.getGreen() > 253 && color.getBlue() > 253)
			{
				label.setBackground(Color.BLACK);
			}
			else
			{
				label.setBackground(Color.WHITE);
			}
			
			label.setText("Current Color: R: " + color.getRed() + ", G: " + color.getGreen() + ", B: " + color.getBlue());
			label.setForeground(color);
		}
	}
}
