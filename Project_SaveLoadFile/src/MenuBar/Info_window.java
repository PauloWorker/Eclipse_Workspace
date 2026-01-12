package MenuBar;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Info_window extends JFrame {
	
	int width = 400; //Width of the window
	int height = 240; //Height of the window
	
	String html = "<html>"
				+ "<p>"
				+ "<h1>"
				+ "Project Save & Load File"
				+ "</h1>"
				+ "</p>"
				+ "<p>"
				+ "<h2>"
				+ "Version 1.00"
				+ "</h2>"
				+ "</p>"
				+ "</html>";

	JLabel label = new JLabel();
	
	Info_window()
	{
		this.setTitle("Project Save & Load File - Info");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(width, height);
		this.setLayout(new FlowLayout(FlowLayout.LEADING));
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.add(label);
		
		label.setText(html);
	}
}
