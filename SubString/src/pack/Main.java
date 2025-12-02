package pack;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		//SubString =  used to split the string in two parts
		
		String email = JOptionPane.showInputDialog("Enter your email: ").trim();
		String name;
		String type;
		
		if(email.indexOf('@') == -1)
		{
			JOptionPane.showMessageDialog(null, "You need to type the '@' in the email box");
		}
		else if(email.lastIndexOf('@') > email.indexOf('@'))
		{
			JOptionPane.showMessageDialog(null, "You need to type just once '@' in the email box");
		}
		else
		{
			name = email.substring(0, email.indexOf('@'));
			type = email.substring(email.indexOf('@') + 1);
			JOptionPane.showMessageDialog(null, String.format("Username: %s\nType of email: %s\nEmail: %s", name, type, email));
		}
	}
}
