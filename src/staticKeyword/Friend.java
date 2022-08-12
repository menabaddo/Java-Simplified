package staticKeyword;

public class Friend {

	String name; // assigned to each individual objects if static keyword is not used
	static int noOfFriends;

	Friend(String name) {
		this.name = name;
		noOfFriends++;

	}

	static void displayFriends() {

		if (noOfFriends <= 1) {
			System.out.println("You have " + noOfFriends + " friend");
		} else {
			System.out.println("You have " + noOfFriends + " friends");

		}

	}

}
