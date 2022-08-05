package userInput;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		System.out.println("Hello " + name);

		System.out.println("What is your age? ");
		int age = scanner.nextInt();
		System.out.println("Your age is " + age);
		scanner.nextLine();

		/**
		 * Added line 18 to clear the escape character \n after using the .nextInt
		 * method because the .nextInt method doesn't clear the escape character.
		 */
		System.out.println("What is your favorite food? ");
		String food = scanner.nextLine();
		System.out.println("Your favorite food is " + food);


	}

}
