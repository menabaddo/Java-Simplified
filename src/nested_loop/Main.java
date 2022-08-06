package nested_loop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// nested loop is a loop inside a loop

		int rows;
		int columns;
		String symbols = "";

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();

		System.out.println("Enter number of columns: ");
		columns = scanner.nextInt();

		System.out.println("Enter Symbol: ");
		symbols = scanner.next();

		for (int i = 1; i <= rows; i++) {
			/**
			 * this first for loop will execute once and wait for the next for loop to be
			 * done before executing again
			 * 
			 * loop adds a row
			 */
			System.out.println();
			for (int j = 1; j <= columns; j++) {

				/**
				 * this loop basically adds the symbols based on the number of times the user
				 * specified
				 */

				System.out.print(symbols);
				// print moves cursor by a blank space and adds new symbol

			}
		}

	}

}
