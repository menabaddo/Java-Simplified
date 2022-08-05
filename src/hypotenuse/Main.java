package hypotenuse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first side: ");
		a = scanner.nextInt();
		System.out.println("Enter second side: ");
		b = scanner.nextInt();

		c = Math.sqrt((a * a) + (b * b));
		System.out.println("The hypotenuse of the Triangle is: " + c);

	}

}
