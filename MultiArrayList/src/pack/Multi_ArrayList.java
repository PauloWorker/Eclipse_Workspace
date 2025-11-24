package pack;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Multi_ArrayList {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		ArrayList<String> drinkList = new ArrayList<String>();
		ArrayList<String> produceList = new ArrayList<String>();
		
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		drinkList.add("soda");
		drinkList.add("coffee");
		drinkList.add("water");
		
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		groceryList.add(bakeryList);
		groceryList.add(drinkList);
		groceryList.add(produceList);
		
		JOptionPane.showMessageDialog(null, groceryList.get(0));
	}
}
