package Super_keyword;

public class Main {
	public static void main(String[] args) {
		//super = refers to the superclass (parent) of an object
		//		  very similiar to the "this" keyword
		
		Hero hero1 = new Hero("Batman", 54, "$$$");
		Hero hero2 = new Hero("IronMan", 52, "Metal");
		Hero hero3 = new Hero("Wonder Woman", 54, "Wonder");
		
		System.out.println(hero1.toString());
		System.out.println(); //Break line
		System.out.println(hero2.toString());
		System.out.println(); //Break line
		System.out.println(hero3.toString());
		
	}
}
