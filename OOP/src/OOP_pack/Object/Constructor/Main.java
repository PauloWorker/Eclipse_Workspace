package OOP_pack.Object.Constructor;

public class Main {
	public static void main(String[] args) {
		Human person1 = new Human("Keene", 26, 76.45);
		Human person2 = new Human("Jeany", 23, 71.70);
		Human person3 = new Human("Howard", 45, 81.0);
		
		person1.Info();
		System.out.println("");
		person2.Info();
		System.out.println("");
		person3.Info();
	}
}
