package switches;

public class Main {

	public static void main(String[] args) {
		/**
		 * Switch is used to test a variable against a list of values
		 * 
		 * 
		 */

		String month = "December";

		switch (month) {
		case "January":
			System.out.println("It is January");
			break;
		case "February":
			System.out.println("It is February");
			break;
		case "March":
			System.out.println("It is March");
			break;
		case "April":
			System.out.println("It is April");
			break;
		case "May":
			System.out.println("It is May");
			break;
		case "June":
			System.out.println("It is June");
			break;
		case "July":
			System.out.println("It is July");
			break;
		case "August":
			System.out.println("It is August");
			break;
		case "September":
			System.out.println("It is September");
			break;
		case "October":
			System.out.println("It is October");
			break;
		// break helps to prevent executing the rest of the case once a match is found
		case "November":
			System.out.println("It is November");
			break;
		case "December":
			System.out.println("It is December");
			break;
		default:
			throw new IllegalArgumentException("Invalid month: " + month);
		}

	}

}
