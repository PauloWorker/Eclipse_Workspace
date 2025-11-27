package file_writer;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("src/file_writer/text.txt");
		
			writer.write("First Text\nSecond Text\nThird Text");
			writer.append("\n(Append text)");
			writer.close(); // Always close the file when it's called, make sure to close the file after work
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
