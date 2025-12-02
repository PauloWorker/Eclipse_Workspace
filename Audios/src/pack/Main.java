package pack;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Scanner scanner = new Scanner(System.in);
		
		File file = new File("src/Clint_Eastwood.wav");
		
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file) ;
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		String response = "";
		
		while(!response.equalsIgnoreCase("Q"))
		{
			System.out.println();
			System.out.println("Welcome to the audio player");
			System.out.println("Choose one of the option below");
			System.out.println("Type 'P' to play");
			System.out.println("Type 'S' to stop");
			System.out.println("Type 'R' to reset");
			System.out.println("Type 'Q' to Quit");
			System.out.print("Enter your choice: ");
			response = scanner.next();
			
			response = response.toUpperCase();
			
			System.out.println();
			
			switch(response)
			{
				case "P":
					clip.start();
					break;
					
				case "S":
					clip.stop();
					break;
					
				case "R":
					clip.setMicrosecondPosition(0);
					break;
					
				case "Q":
					clip.close();
					break;
					
				default:
					System.out.println("Not a valid response");
					break;
			}
		}
		System.out.println("Audio Player closed");
	}
}
