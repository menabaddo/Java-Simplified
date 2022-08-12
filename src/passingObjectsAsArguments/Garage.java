package passingObjectsAsArguments;

public class Garage {

	void park(Car car) { // just like the way we pass a string to a method i.e void Park(String name),
		// is the same way you can pass an object using the name of the class of the
		// object and the name of the object.
		System.out.println("The " + car.name + " is parked in the garage");

	}

}
