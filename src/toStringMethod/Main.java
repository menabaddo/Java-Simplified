package toStringMethod;

public class Main {

	// toString() = special method that all objects inherit,
	// that returns a string "textually represents" an object.
	// can be used both implicitly and explicitly

	public static void main(String[] args) {
		Car myCar = new Car();


		System.out.println(myCar.toString()); // explicit // gives you the address of the object on memory, like the
												// street address
		// .toString() is already added by default

		System.out.println(myCar); // implicit

		// .toString() could also be overridden
	}

}
