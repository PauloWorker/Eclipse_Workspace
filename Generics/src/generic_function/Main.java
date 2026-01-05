package generic_function;

public class Main {
	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.3, 3.4, 4.6, 5.3};
		Character[] charArray = {'C', 'H', 'A', 'R'};
		String[] stringArray = {"S", "T", "R"};
		
		displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
		displayArray(stringArray);
	}
	
	public static <Thing> void displayArray(Thing[] array)
	{
		for(Thing x : array)
		{
			System.out.print(x + ", ");
		}
		System.out.println();
	}
}
