package constructor;

public class Main {

	public static void main(String[] args) {

		// Constructor = special method that is called when an object is instantiated
		// (created)

		Human Alex = new Human("Alex", 10, 10);

		Alex.eat();
		// why is constructor useful; it allows a Java developer to be able to
		// create objects that have different Attributes
		Human Alex2 = new Human("Alex2", 11, 11);
		Alex2.drink();

		System.out.println(Alex2.age);

		// basically constructors allows user to assign different attributes
		// to objects that are instantiated


	}

}
