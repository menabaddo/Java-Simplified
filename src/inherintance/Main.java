package inherintance;

public class Main {

	public static void main(String[] args) {
		// inheritance = the process where one class acquires,
		// the attributes and methods of another class

		// benefit
		// you don't have to create multiple attributes and methods for each class


		Car car = new Car();


		System.out.println(car.speed); // we can access the attribute of the super class vehicle

		car.go(); // methods can also be accessed from the super class

		Bicycle bike = new Bicycle();

		bike.stop();

		// each individual class can have it's own attributes and methods
		// i.e
		System.out.println(car.wheels);
		System.out.println(bike.pedals);

		// you can use inheritance when you are dealing with multiple classes
		// you can list common attributes or methods similar to two child class in a
		// parent class
	}

}
