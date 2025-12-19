package KeyListener;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener {
	
	JLabel label = new JLabel();
	
	int speed = 15;
	int x = 0;
	int y = 0;
	
	int limitX = this.getWidth();
	int limitY = this.getHeight();
	
	MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setSize(800, 640);
		this.setLayout(null);
		this.setVisible(true);
		this.addKeyListener(this);
		this.add(label);
		
		label.setBounds(x, y, 100, 100);
		label.setOpaque(true);
		label.setBackground(Color.blue);
		
		limitX = this.getWidth();
		limitY = this.getHeight();
		
		System.out.println(limitX);
		System.out.println(limitY);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		limitX = this.getWidth();
		limitY = this.getHeight();
		
		// KeyTyped =  Invoked when a key is typed, Uses KeyChar, char output
		switch(e.getKeyChar())
		{
			case 'w':
				y -= speed;
				break;
				
			case 's':
				y += speed;
				break;
				
			case 'a':
				x -= speed;
				break;
				
			case 'd':
				x += speed;
				break;
		}
		
		x = Math.min(Math.max(0, x), limitX - 116);
		y = Math.min(Math.max(0, y), limitY - 139);

		
		label.setBounds(x, y, 100, 100);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// KeyPressed =  Invoked when a physical key is pressed down, Uses KeyCode, int output
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// KeyReleased =  Called whatever
		
		System.out.println("Key released, key: " + e.getKeyChar());
		System.out.println("Key released, code: " + e.getKeyCode());
		System.out.println();
	}
}
