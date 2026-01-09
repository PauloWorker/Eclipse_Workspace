package MenuBar;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SaveFile implements Serializable {
	
	public SaveFile(String name, String password) throws IOException
	{
		User user = new User(name, password);
		
		final FileOutputStream fileOut = new FileOutputStream("src/FileData.ser");
		final ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		System.out.println("File Saved");
	}
}
