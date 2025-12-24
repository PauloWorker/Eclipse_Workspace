package DragAndDrop;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	
	DragPanel dragPanel = new DragPanel();
	
	
	MyFrame()
	{
		this.setTitle("Drag & Drop");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setSize(640, 480);
		this.setVisible(true);
		this.add(dragPanel);
		
	}
	
	
}
