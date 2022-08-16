package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// exception = an event that occurs during the execution of a program that,
		// disrupts the normal flow of instructions
		try {

		System.out.println("Enter a whole number");
		int x = scanner.nextInt();

		System.out.println("Enter a whole number to divide by: ");
		int y = scanner.nextInt();

		int z = x / y;

		System.out.println("result: " + z);
	} catch (ArithmeticException e) { // caught arithmetic exception
		System.out.println("You can't divide by 0");

	} catch (InputMismatchException e) { // catching wrong input exception
		System.out.println("Please enter a number");
	} catch (Exception e) { // catching general exception
		System.out.println("Something went wrong");
	}
	finally {
		scanner.close(); // it's good practice to close the any opened scanner or connection in the
							// finally block
	}

	}

}
