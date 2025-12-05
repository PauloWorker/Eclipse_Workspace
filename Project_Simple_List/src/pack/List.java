package pack;

import java.time.LocalDateTime;

public class List {
	String task;
	private final LocalDateTime currentTime = LocalDateTime.now();
	private String s = currentTime.toString(); //Convert the LocalDateTime to String
	private String date = s.substring(0, s.indexOf('T')); //Get the Date
	private String time = s.substring(s.indexOf('T') + 1, s.indexOf('.')); //Get the Time
	
	List(String task)
	{
		this.task = task;
	}
	
	public void print() //Debug
	{
		System.out.println("LocalDateTime: " + currentTime);
		System.out.println("Date: " + date);
		System.out.println("Time: " + time);
	}
}
