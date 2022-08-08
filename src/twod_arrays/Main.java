package twod_arrays;

public class Main {
	
	public static void main(String[] args) {
		// 2D array = an array of arrays

		// a 2d array uses two straight braces

		String[][] cars = { { "Honda", "Tesla", "Toyota" }, { "Ford", "Lambo", "Ferrari" },
				{ "Mercedes", "Tundra", "Mini" } }; // new String[3][3];

		/*
		 * Two methods includes assignment during declaration of the variable
		 * 
		 * or you could declare the size of the variable then assign later
		 */

//		cars[0][0] = "Honda";
//		cars[0][1] = "Tesla";
//		cars[0][2] = "Toyota";
//
//		cars[1][0] = "Ford";
//		cars[1][1] = "Lambo";
//		cars[1][2] = "Ferrari";
//
//		cars[2][0] = "Mercedes";
//		cars[2][1] = "Tundra";
//		cars[2][2] = "Mini";

		for (int i = 0; i < cars.length; i++) {

			System.out.println("-----------------------------------------------");
			for (int j = 0; j < cars[i].length; j++) {
				/**
				 * cars[i].length takes note of the length of the inner arrays
				 */
				System.out.println(cars[i][j]);
			}
		}
		
	}

}
