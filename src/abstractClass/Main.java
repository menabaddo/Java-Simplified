package abstractClass;

public class Main {

	public static void main(String[] args) {
		// abstract = abstract classes cannot be instantiated, but they can have a
		// subclass
		// abstract methods are declared without an implementation

		// adds a layer of security to the class

//		Vehicle vehicle = new Vehicle(); object cannot be created of an abstract class

		Car car = new Car();

		car.go();

	}

}
