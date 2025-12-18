package KeyListener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements KeyListener {
	MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setSize(320, 320);
		this.setLayout(null);
		this.setVisible(true);
		this.addKeyListener(this);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// KeyTyped =  Invoked when a key is typed, Uses KeyChar, char output
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// KeyPressed =  Invoked when a physical key is pressed down, Uses KeyCode, int output
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// KeyReleased =  Called whatever
		
	}
}
