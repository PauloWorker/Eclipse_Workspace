package file_class;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		
		File file = new File("src/secret_message.txt"); 
	
		if(file.exists())
		{
			System.out.println("That file exists");
			System.out.println(file.getPath()); // To get the simple path of the file
			System.out.println(file.getAbsolutePath()); // To get the full path of the file
			System.out.println(file.isFile()); // To identify if the file is a real file, will return a boolean value
			//file.delete();
		}
		else
		{
			System.out.println("That file doesn't exists!");
		}
	}
}
