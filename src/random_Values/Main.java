package random_Values;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		// PseudoRandom
		// Meaning it is generated by a definite mathematical procedure
		Random random = new Random();

		/**
		 * supplying a parameter to line 20 will generate a value < n where n is value
		 * supplied. but if you want to the randomness to generate up to n just add 1
		 */

		int x = random.nextInt();

		int y = random.nextInt(6) + 1;

		System.out.println(y);

		// random can also be used with boolean data type

		boolean a;

		a = random.nextBoolean();

		System.out.println(a);


	}
}
