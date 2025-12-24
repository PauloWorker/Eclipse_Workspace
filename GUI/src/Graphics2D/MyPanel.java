package Graphics2D;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener{

	int health = 270;
	Graphics2D g2D;
	JLabel label = new JLabel();
	
	MyPanel()
	{
		this.setPreferredSize(new Dimension(500, 500));
		this.addKeyListener(this);
		label.addKeyListener(this);
	}
	
	public void paint(Graphics g)
	{
		g2D = (Graphics2D) g;
		
		//g2D.drawLine(x1, y1, x2, y2); - Draw a line
		//g2D.drawRect(x, y, width, height); //Draw a Rectangle
		//g2D.drawArc(x, y, width, height, start degrees, end degrees); //Draw a Arc
		
		
		//g2D.drawLine(0, 0, 500, 500);
		
		//g2D.drawRect(5, 5, 50, 50); //Draw a Rectangle
		//g2D.fillRect(5, 5, 50, 50); //Fill the Rectangle
		
		//g2D.drawOval(5, 5, 50, 50);
		//g2D.fillOval(5, 5, 50, 50);
		
		g2D.setPaint(Color.DARK_GRAY);
		g2D.setStroke(new BasicStroke(20));
		g2D.drawArc(25, 25, 200, 200, 360, 90); //Draw a Arc
		
		g2D.setPaint(Color.gray);
		g2D.setStroke(new BasicStroke(20));
		g2D.drawArc(25, 25, 200, 200, 360, -270); //Draw a Arc
		
		
		g2D.setPaint(Color.blue);
		g2D.setStroke(new BasicStroke(7));
		g2D.drawArc(25, 25, 200, 200, 360, -health); //Draw a Arc
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch(e.getKeyChar())
		{
			case 'w':
				health++;
				System.out.println("Up");
				break;
				
			case 's':
				health--;
				System.out.println("Down");
				break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
