package mathClass;

public class Main {

	public static void main(String[] args) {

		double a = 9;
		double x = 3.4;
		double y = -2;

		// Max method used to find the max value of two variables

		System.out.println(Math.max(x, y));

		// Min method used to find the minimum value of two variables

		System.out.println(Math.min(x, y));

		// Abs method is used to return the absolute value

		System.out.println(Math.abs(x));

		System.out.println(Math.sqrt(a));

		// rounds up the number x < 5 round down x >= 5 round up

		System.out.println(Math.round(x));

		// will always round up
		System.out.println(Math.ceil(x));

		// will always round down
		System.out.println(Math.floor(x));

	}

}
