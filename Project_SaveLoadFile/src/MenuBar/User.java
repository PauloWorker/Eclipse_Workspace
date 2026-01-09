package MenuBar;

import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 213L;
	
	String name;
	String password;
	
	User()
	{
		
	}
	
	User(String name, String password)
	{
		this.name = name;
		this.password = password;
	}
}
