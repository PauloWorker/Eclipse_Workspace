package pack;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws IOException {
		
		//						Steps to Serialize
		//						--------------------------------------------------------------
		//						1. Your object class should implement Serializable interface
		//						2. Add import java.io.Serializable
		//						3. FileOutputStream fileOut = new FileOutputStream(file path);
		//						4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
		//						5. out.writeObject(objectName);
		//						6. out.close(); fileOut.close();
		//						--------------------------------------------------------------
		
		
		User user = new User();
		
		user.name = "Brother";
		user.password = "14441432";
		
		FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		
		System.out.println("Object saved!");
	}
}
