package JOptionPane_Messages;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Normal Message", "title", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Info Message", "title", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Question Message", "title", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Warning Message", "title", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Error Message", "title", JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showConfirmDialog(null, "Do you even code?", "title", JOptionPane.YES_NO_OPTION);
		
		//JOptionPane.showOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue); =  Show Option is much customizable

		String[] response = {"Option 1", "Option 2", "Option 3"};
		ImageIcon icon = new ImageIcon("src/check_icon.png");
		JOptionPane.showOptionDialog(null, "Message", "title", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, response, 0);
	}
}
