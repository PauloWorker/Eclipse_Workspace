package ProgressBar;

import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0, 500); //JProgressBar(int min, int max)
	
	ProgressBarDemo()
	{
		
		bar.setValue(0);
		bar.setBounds(0, 0, 420, 50);
		bar.setStringPainted(true); //Enable the percent value to be showed
		bar.setForeground(new Color(0x126212));
		bar.setBackground(new Color(0x000000));
		bar.setFont(new Font("MV Boli", Font.BOLD, 25));
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(640, 320);
		frame.setLayout(null);
		frame.setVisible(true);
		
		frame.add(bar);
		
		fill();
	}
	
	public void fill()
	{
		int counter = 0;
		
		while(counter <= bar.getMaximum())
		{
			bar.setValue(counter);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
					
				e.printStackTrace();
			}
			counter += 10;
		}
		bar.setString("Done"); //Set a String text when bar is completed
	}
}
