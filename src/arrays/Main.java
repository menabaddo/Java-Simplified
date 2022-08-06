package arrays;

public class Main {

	public static void main(String[] args) {
		// array is used to store multiple values in a single variable

		String[] cars = { "Inosen", "Honda", "Bentley" };

		// arrays element data type has to be consistent

		// you could also replace existing element

		cars[0] = "Toyota";

//		System.out.println(cars[0]);

		// Another way of creating an array by allocating the size of the array before
		// assigning
		// elements to the array

		String[] schools = new String[3];

		schools[0] = "Niit";
		schools[1] = "Sgss";
		schools[2] = "Pledge";

		for (int i = 0; i < schools.length; i++) {
			/**
			 * i should always be less than array length or else it will throw an error
			 * stating index out of bounds
			 */
			System.out.println(schools[i]);

		}
	}

}
