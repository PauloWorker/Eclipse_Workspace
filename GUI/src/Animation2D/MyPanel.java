package Animation2D;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener{

	int maxHealth = 270;
	int currentMaxHealth = 90;
	int health = 200;
	int add = 15;
	boolean active = false;
	Graphics2D g2D;
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	
	MyPanel()
	{
		this.setVisible(true);
		this.setFocusable(true);
		this.setPreferredSize(new Dimension(500, 500));
		this.addKeyListener(this);
		this.add(plus);
		this.add(minus);
		
		plus.setVisible(true);
		minus.setVisible(true);
	
		health = Math.min(Math.max(0, health), currentMaxHealth);
		
		while(active)
		{
			if(health <= 0)
			{
				repaint();
				upHealth();
			}
			else if(health >= 270)
			{
				repaint();
				downHealth();
				
			}
			System.out.println("Health: " + health);
		}
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
		g2D.drawArc(25, 25, 250, 250, 360, 90); //Draw a Arc
		
		g2D.setPaint(Color.gray);
		g2D.setStroke(new BasicStroke(20));
		g2D.drawArc(25, 25, 250, 250, 360, -270); //Draw a Arc
		
		g2D.setPaint(new Color(0x555555));
		g2D.setStroke(new BasicStroke(7));
		g2D.drawArc(25, 25, 250, 250, 360, -270); //Draw a Arc
		
		g2D.setPaint(new Color(0x222222));
		g2D.setStroke(new BasicStroke(7));
		g2D.drawArc(25, 25, 250, 250, 360, -currentMaxHealth); //Draw a Arc
		
		if(health >= maxHealth)
		{
			g2D.setPaint(Color.blue);
		}
		else if(health >= 90 && health < maxHealth)
		{
			g2D.setPaint(Color.green);
		}
		else if(health >= 45 && health < 90)
		{
			g2D.setPaint(Color.yellow);
		}
		else if(health >= 0 && health < 45)
		{
			g2D.setPaint(Color.red);
		}
		
		g2D.setStroke(new BasicStroke(7));
		g2D.drawArc(25, 25, 250, 250, 360, -health); //Draw a Arc
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		repaint();
		
		switch(e.getKeyChar())
		{
			case 'w':
				upHealth();
				System.out.println("Up");
				break;
				
			case 's':
				downHealth();
				System.out.println("Down");
				break;
				
			case 'q':
				downMaxHealth();
				System.out.println("downgrade");
				break;
				
			case 'e':
				upMaxHealth();
				System.out.println("upgrade");
				break;
				
			case 'a':
				health = 0;
				active = !active;
				System.out.println("Auto: " + active);
				break;
				
			default:
				System.out.println("Key " + e.getKeyChar() + " pressed");
				break;
		}
		System.out.println("Health: " + health);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void upHealth()
	{
		health += add;
		health = Math.min(Math.max(0, health), currentMaxHealth);
	}
	
	public void downHealth()
	{
		health -= add;
		health = Math.min(Math.max(0, health), currentMaxHealth);
	}
	
	public void upMaxHealth()
	{
		currentMaxHealth += add;
		currentMaxHealth = Math.min(Math.max(0, currentMaxHealth), maxHealth);
		
		health = Math.min(Math.max(0, health), currentMaxHealth);
	}
	
	public void downMaxHealth()
	{
		currentMaxHealth -= add;		
		currentMaxHealth = Math.min(Math.max(0, currentMaxHealth), maxHealth);
		
		health = Math.min(Math.max(0, health), currentMaxHealth);
	}
}
