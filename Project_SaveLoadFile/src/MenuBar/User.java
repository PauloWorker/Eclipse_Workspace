package MenuBar;

import java.io.Serializable;

import javax.swing.JPasswordField;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 213L;
	
	private String name;
	private char[] password;
	
	User()
	{
		
	}
	
	User(String name, JPasswordField password)
	{
		this.setName(name);
		this.setPassword(password);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		String s = "";
		
		for(char c : password)
		{
			s += c;
		}
		
		return s;
	}

	private void setPassword(JPasswordField password) {
		this.password = password.getPassword();
	}
}
