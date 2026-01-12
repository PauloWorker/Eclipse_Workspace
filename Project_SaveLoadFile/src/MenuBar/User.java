package MenuBar;

import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 213L;
	
	private String name;
	private String password;
	
	User()
	{
		
	}
	
	User(String name, String password)
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
		return password;
	}

	private void setPassword(String password) {
		this.password = password;
	}
}
