package toStringMethod;

public class Car {

	String make = "Mercedes";
	String model = "Brabus";
	String color = "Black";
	int year = 2022;

	@Override
	public String toString() {

		return make + "\n" + model + "\n" + color + "\n" + year;

		// instead of getting the address, we get a textual representation
		// of the attributes of that object
	}

}
