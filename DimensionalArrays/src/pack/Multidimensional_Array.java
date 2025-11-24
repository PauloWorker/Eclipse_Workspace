package pack;

import javax.swing.JOptionPane;

public class Multidimensional_Array {
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Enter # rows: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Enter # columns: "));
		
		int[][] matrix = new int[x][y];
		
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[0].length; j++)
			{
				JOptionPane.showConfirmDialog(null, String.format("Rows: %d\nColumns: %d", i, j));
			}
		}

	}
}
