package passingObjectsAsArguments;

public class Main {

	public static void main(String[] args) {
		Garage garage = new Garage();

		Car car = new Car("Mercedes");
		Car car2 = new Car("Tesla");

		garage.park(car2);

	}

}
