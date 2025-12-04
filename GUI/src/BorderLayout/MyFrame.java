package BorderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyFrame extends JFrame{
	
	JPanel[] panels = {new JPanel(),new JPanel(),new JPanel(),new JPanel(), new JPanel()};
	
	MyFrame() {
		
		panels[0].setBackground(Color.red);
		panels[1].setBackground(Color.green);
		panels[2].setBackground(Color.blue);
		panels[3].setBackground(Color.yellow);
		panels[4].setBackground(Color.gray);
		
		panels[0].setPreferredSize(new Dimension(100, 100));
		panels[1].setPreferredSize(new Dimension(100, 100));
		panels[2].setPreferredSize(new Dimension(100, 100));
		panels[3].setPreferredSize(new Dimension(100, 100));
		panels[4].setPreferredSize(new Dimension(100, 100));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 640);
		this.setVisible(true);
		this.setLayout(new BorderLayout(10, 10));
		
		this.add(panels[0], BorderLayout.NORTH);
		this.add(panels[1], BorderLayout.EAST);
		this.add(panels[2], BorderLayout.SOUTH);
		this.add(panels[3], BorderLayout.WEST);
		this.add(panels[4], BorderLayout.CENTER);
		
	}
}
