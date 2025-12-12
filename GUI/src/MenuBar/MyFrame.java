package MenuBar;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener{
	
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenu editMenu = new JMenu("Edit");
	JMenu helpMenu = new JMenu("Help");
	
	JMenuItem loadItem = new JMenuItem("Load");
	JMenuItem saveItem = new JMenuItem("Save");
	JMenuItem exitItem = new JMenuItem("Exit");
	
	ImageIcon loadIcon = new ImageIcon("src/folder.png");
	ImageIcon saveIcon = new ImageIcon("src/save.png");
	ImageIcon exitIcon = new ImageIcon("src/exit.png");
	
	MyFrame()
	{
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(640, 320);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
	
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.add(menuBar);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); //Set a shortcut to the menu "Alt + key"
		editMenu.setMnemonic(KeyEvent.VK_E); //Set a shortcut to the menu "Alt + key"
		helpMenu.setMnemonic(KeyEvent.VK_H); //Set a shortcut to the menu "Alt + key"
		
		loadItem.setMnemonic(KeyEvent.VK_L); //Set a shortcut to the menu item
		saveItem.setMnemonic(KeyEvent.VK_S); //Set a shortcut to the menu item
		exitItem.setMnemonic(KeyEvent.VK_E); //Set a shortcut to the menu item
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == loadItem)
		{
			System.out.println("File loaded");
		}
		
		if(e.getSource() == saveItem)
		{
			System.out.println("File saved");
		}
		
		if(e.getSource() == exitItem)
		{
			System.exit(0);
		}
		
	}
}
