package overloaded_methods;

public class Main {

	public static void main(String[] args) {
		// over loaded methods = methods that share the same name but have different
		// parameters
		// method name + parameters = method signature

		System.out.println(add(1.0, 2, 3));
		// runs based on parameter
	}

	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}

	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}

	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c + d;
	}

	static double add(double a, double b) {
		System.out.println("This is overloaded method #4");
		return a + b;
	}

	static double add(double a, double b, double c) {
		System.out.println("This is overloaded method #5");
		return a + b + c;
	}

	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloaded method #6");
		return a + b + c + d;
	}

	// double presides over integer


}
