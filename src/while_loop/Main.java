package while_loop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";

		while (name.isBlank()) {
			System.out.println("Enter your Name: ");
			name = scanner.nextLine();
		}

		System.out.println("Hello Alexander");

		// do while loop executes the code in the do condition
		// at least one regardless of the condition

		do {
			System.out.println("Enter your Name: ");
			name = scanner.nextLine();
		} while (name.isBlank());

		System.out.println("Hello Alexander");

	}


}
