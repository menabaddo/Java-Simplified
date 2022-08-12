package staticKeyword;

public class Main {

	public static void main(String[] args) {

		// static = modifier. A single copy of a variable/method is created and shared.
		// The class "owns" the static member

		Friend friend1 = new Friend("Edmund");
		Friend friend2 = new Friend("Safia");
		Friend friend3 = new Friend("Momo");

//		System.out.println(Friend.noOfFriends); // noOfFriends variable is owned by the Friend class, so you don't need
												// an object to access it

//		System.out.println(friend1.noOfFriends); // You can also access a static variable using the named instance
		// not recommended

		Friend.displayFriends(); // we have to use the name of the class to access the method because it's a
									// static keyword

		Math.round(0);
	}

}
