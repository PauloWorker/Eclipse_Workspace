package general_classes;

public class Main {
	public static void main(String[] args) {
		
		//Generics -  used to define any data type in a class or function
		
		MyGenericClass<Integer, Integer> myInt = new MyGenericClass(5, 3);
		MyGenericClass<Double, Double> myDouble = new MyGenericClass(3.14, 6.28);
		//MyGenericClass<Character, Character> myChar = new MyGenericClass('c', 'h');
		//MyGenericClass<String, String> myString = new MyGenericClass("string", "string2");
		
		System.out.println(myInt.GetFirstValue());
		System.out.println(myDouble.GetLastValue());
		//System.out.println(myChar.GetFirstValue());
		//System.out.println(myString.GetLastValue());
	}
}
