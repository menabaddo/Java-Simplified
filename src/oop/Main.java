package oop;

public class Main {

	public static void main(String[] args) {

		// object = an instance of a class that may contain attributes and methods
		// example: (phone, desk, computer, coffee cup)

		// attributes are more or less the characteristics of the object
		// methods are more or less the action the object can perform

		// creating object of car class

		Car myCar = new Car();

		Car mySecondCar = new Car();

		System.out.println(myCar.make);
		System.out.println(myCar.price);

		System.out.println(mySecondCar.make);

		myCar.drive();

	}

}