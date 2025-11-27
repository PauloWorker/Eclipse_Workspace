package file_reader;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) {
		
		// FileReader =  read the contents of a file as stream of characters. One by one
		// 				 read() returns an int value which contains the byte value,
		//  			 when read() returns -1, there's no more data to be read.
		
		try {
			FileReader reader = new FileReader("src/art.txt");
			
			int data = reader.read();
			while(data != -1)
			{
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();	
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
