package if_or_else_statement;

public class Main {

	public static void main(String[] args) {
		/**
		 * if performs a block of code if it meets the condition specified but if
		 * condition is not met it jumps to the else block
		 * 
		 * note < > <= >= != == are called comparison operators
		 */

		int temp = 21;

		// if the if condition is met it skips the remaining conditions

		if (temp <= 20) {
			System.out.println("Its cold");

		} else if (temp < 0) {
			System.out.println("It's very cold");
		} else {
			System.out.println("Its hot");
		}

	}

}
