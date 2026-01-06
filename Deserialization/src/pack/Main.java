package pack;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//						Steps to Deserialize
		//						--------------------------------------------------------------
		//						1. Declare your object(don't instantiate)
		//						2. Your class should implement Serializable interface
		//						3. Add import java.io.Serializable
		//						4. FileOutputStream fileIn = new FileInputStream(file path);
		//						5. ObjectOutputStream in = new ObjectInputStream(fileIn);
		//						6. objectName = (Class) in.readObject();
		//						7. in.close(); fileIn.close();
		//						--------------------------------------------------------------
		
		//						Notes
		//						--------------------------------------------------------------
		//						1. children classes of a parent class that implements Serializable will do so as well
		//						2. static fields are not serialized (they belong to the class, not an individual object)
		//						3. the class's definition ("class file") itself is not recorded, cast it as the object type
		//						4. fields declared as "transient" aren't serialized, they're ignored
		//						5. serialVersionUID is a unique version ID for a class that is serializable
		//						--------------------------------------------------------------

		
		User user = null;
		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\paulosr\\eclipse-workspace\\Serialization\\UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		
		long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		System.out.println(serialVersionUID);
		
	}
}
