package MenuBar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class LoadFile {
	
	protected User user;
	
	public LoadFile() throws IOException, ClassNotFoundException
	{
		user = null;
				
		final FileInputStream fileIn = new FileInputStream("src/FileData.ser");
		final ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();
		
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		
		System.out.println("File Loaded");
		System.out.println("Serial Version UID: " + serialVersionUID);
		System.out.println("Name: " + user.getName());
		System.out.println("Password: " + user.getPassword());
	}
}
