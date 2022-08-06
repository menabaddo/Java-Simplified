package logicalOperator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// logical is used to connect two or more expresions

		/**
		 * && is used to check if both conditions are true
		 * 
		 * || (OR) is used to check if one of the condition us true
		 * 
		 * ! reverses the boolean value of condition
		 */

		// &&(AND)

		int speed = 54;

		if (speed > 90) {
			System.out.println("You need to slow down");

		} else if (speed <= 30 && speed > 0) {
			System.out.println("Speed is Gucci!!!");
		} else {
			System.out.println("Start Moving");
		}

		// ||(OR) as long as one is true

		Scanner scanner = new Scanner(System.in);

		System.out.println("You are Playing a game");

		System.out.println("Press Q/q to quit");
		String a = scanner.nextLine();
		if (!a.equals("q") && !a.equals("Q")) {
			System.out.println("Still Playing");

			// the not operator converts true to false and false to true

		} else {

			System.out.println("Sorry to see you leave");
		}



	}


}
