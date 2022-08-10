package methods;

public class Main {

	public static void main(String[] args) {

		// method = a block of code that is executed whenever it is called upon

		// instance of a class has to be created in order to call a method of that class
		Main obj = new Main();

		int age = 21;

//		obj.say_hello("Alex"); //parameter is required

		say_hello("Edmund", age);

		int x = 3;
		int y = 4;

		int result;

		result = addition(3, 2);

		System.out.println(result);

	}

	static void say_hello(String name, int age) { // you could also pass a parameter to a method to use it within your
													// method
		// making the method static allows you to call the method without using an
		// object
		System.out.println("Hello " + name + " and you are " + age + " years old");

	}

	static int addition(int x, int y) {

		int result = Math.addExact(x, y);

		// you could also return line 39 directly

		return result; // return results to where called
		// result is local variable so you can use it twice

	}

}
