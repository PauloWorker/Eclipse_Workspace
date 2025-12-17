package SelectFile;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton button = new JButton("Select File");
	
	MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.pack();
		this.setLayout(null);
		this.setSize(640, 320);
		this.setVisible(true);
		
		button.setBounds(0, 0, 200, 50);
		button.addActionListener(this);
		
		this.add(button);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button)
		{
			JFileChooser fileChooser = new JFileChooser();
			
			//fileChooser.showOpenDialog(null); //Select file to open, and return 0 if chosen a file and 1 if doesn't choose a file
			//fileChooser.showSaveDialog(null); //Save a new file
			
			fileChooser.setCurrentDirectory(new File(".")); //Set the current directory
			
			//int response = fileChooser.showOpenDialog(null);
			int response = fileChooser.showSaveDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION)
			{
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
	}
}
