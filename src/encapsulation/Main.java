package encapsulation;

public class Main {
	public static void main(String[] args) {
		// Encapsulation = attributes of a class will be hidden or private,
		// can be accessed only through methods (getters & setters)
		// You should make attributes private if you don't have a reason to make them
		// public

		Car car = new Car("Mercedes", "350", 2024);

		car.setModel("400");
		// variables cannot not be accessed without getters ans setters

		System.out.println(car.getMake()); // can only be accessed using the getter method

		System.out.println(car.getModel());
	}

}
