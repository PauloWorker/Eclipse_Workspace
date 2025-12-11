package ProgressBar;

import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	
	ProgressBarDemo()
	{
		
		bar.setValue(0);
		bar.setBounds(0, 0, 420, 50);
		bar.setStringPainted(true); //Enable the percent value to be showed
		
		
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
		
		while(counter <= 100)
		{
			bar.setValue(counter);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
					
				e.printStackTrace();
			}
			counter += 10;
		}
		
		
	}
}
