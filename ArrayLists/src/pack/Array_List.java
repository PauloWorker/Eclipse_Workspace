package pack;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Array_List {
	public static void main(String[] args) {
		
		//arraylist.add(element) to add a element
		//arraylist.set(index, new element) to change a existed element
		//arraylist.remove(index) to remove a element
		//arraylist.size() to return the size of the array list
		//arraylist.get(index) to get a element by index
		//arraylist.clear() to clear all array list
		
		ArrayList<String> food = new ArrayList<String>();
		
		String order;
		String option = "n"; // "No" by default
		
		do {
			order = JOptionPane.showInputDialog("What'll you order?: ");
			
			if(order != null && !order.isEmpty()) 
			{
				food.add(order.trim());
				option = JOptionPane.showInputDialog("Anything else?\nType 'y' to yes\nType 'n' to no");
			} 
			
		} while(option.equalsIgnoreCase("y"));
		
		for(int i = 0; i < food.size(); i++)
		{
			JOptionPane.showMessageDialog(null, String.format("Your order: number: %d\nfood: %s", i + 1, food.get(i)));
		}
	}
}
