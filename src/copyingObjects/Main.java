package copyingObjects;

public class Main {

	public static void main(String[] args) {

		Car car1 = new Car("Mercedes", "Brabsus", 2022);
//		Car car2 = new Car("Ford", "Mustang", 2022);
//
////		car2 = car1; this should'nt be done because you want to keep the original object without replacing it
//		// thus they have the same address
//
//		car2.copy(car1);

		// second method using a copy constructor

		Car car2 = new Car(car1);
		// instead of using a method you can also use a constructor

		System.out.println(car1);
		System.out.println(car2);

		System.out.println();

		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());

		System.out.println();

		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());

	}

}
