package MouseListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener {
	
	JLabel label = new JLabel();
	JLabel text = new JLabel("The action performed will be described here!");
	
	MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setSize(380, 320);
		this.setLayout(null);
		this.setVisible(true);
		this.add(label);
		this.add(text);
		
		label.setBounds(0, 0, 100, 100);
		label.setOpaque(true);
		label.setBackground(Color.gray);
		label.addMouseListener(this);
		
		text.setBounds(5, 105, 360, 50);
		text.setFont(new Font("MV Boli", Font.BOLD, 15));
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// mouseClicked =  Invoked when the mouse was pressed and released
		
		
		label.setBackground(Color.green);
		text.setText("mouseClicked called");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// mousePressed =  Invoked when the mouse was pressed
		
		label.setBackground(Color.red);
		text.setText("mousePressed called");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// mouseReleased =  Invoked when the mouse was released
		
		label.setBackground(Color.blue);
		text.setText("mouseReleased called");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// mouseEntered =  Invoked when the mouse is on the component
		
		label.setBackground(Color.orange);
		text.setText("mouseEntered called");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// mouseExited =  Invoked when the mouse is off the component
		
		label.setBackground(Color.yellow);
		text.setText("mouseExited called");
	}
}
