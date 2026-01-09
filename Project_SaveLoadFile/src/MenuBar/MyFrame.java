package MenuBar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class MyFrame extends JFrame implements ActionListener{
	
	User user = new User();
	SaveFile saveFile;
	LoadFile loadFile;
	
	JLabel l_user = new JLabel("User");
	JLabel l_password = new JLabel("Password");
	
	JPanel menu_panel = new JPanel();
	JPanel panel = new JPanel();
	
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenu editMenu = new JMenu("Edit");
	JMenu helpMenu = new JMenu("Help");
	
	JMenuItem loadItem = new JMenuItem("Load");
	JMenuItem saveItem = new JMenuItem("Save");
	JMenuItem exitItem = new JMenuItem("Exit");
	
	JTextField user_text = new JTextField();
	JTextField password_text = new JTextField();
	
	ImageIcon loadIcon = new ImageIcon("src/folder.png");
	ImageIcon saveIcon = new ImageIcon("src/save.png");
	ImageIcon exitIcon = new ImageIcon("src/exit.png");
	
	public MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(640, 320);
		this.setLayout(new BorderLayout(0, 0));
		this.setVisible(true);
		//this.setResizable(false);
	
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.add(menu_panel, BorderLayout.NORTH);
		this.add(panel);
		
		menu_panel.add(menuBar);
		
		panel.add(l_user);
		panel.add(user_text);
		panel.add(l_password);
		panel.add(password_text);
		
		
		menuBar.setPreferredSize(new Dimension(640, 25));
		
		menu_panel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		menu_panel.setPreferredSize(new Dimension(300, 25));
		//menu_panel.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		
		//panel.setBorder(BorderFactory.createLineBorder(Color.blue, 1));
		panel.setPreferredSize(new Dimension(640, 290));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 2));
		
		
		user_text.setPreferredSize(new Dimension(200, 25));
		password_text.setPreferredSize(new Dimension(200, 25));
		
		
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
		user_text.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == user_text || e.getSource() == password_text)
		{
			
		}
		
		if(e.getSource() == loadItem)
		{
			try {
				loadFile = new LoadFile();
				
				
			} catch (ClassNotFoundException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if(e.getSource() == saveItem)
		{
			if(!user_text.getText().isEmpty() && !password_text.getText().isEmpty())
			{
				try {
					saveFile = new SaveFile(user_text.getText(), password_text.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else
			{
				System.out.println("File not saved");
			}
		}
		
		if(e.getSource() == exitItem)
		{
			System.exit(0);
		}
		
	}
	
	
}
