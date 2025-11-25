package Static_keyword;

public class Main {
	public static void main(String[] args) {
		
		//Static is used to make a variable global, that means, you can access the variable from a Class to another.
		//Static = modifier. A single copy of a variable/method is created and shared.
		//					 The class "owns" the static member.
		
		Friend friend1 = new Friend("SpongeBob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Squiward");
		
		Friend.displayFriends();
	}
}
