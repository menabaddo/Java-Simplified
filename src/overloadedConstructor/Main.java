package overloadedConstructor;

public class Main {

	public static void main(String[] args) {

		// overloaded constructors = multiple constructors within a class with the same
		// name
		// but have different parameters
		// name + parameters = signature

		Pizza pepperoni = new Pizza();
		System.out.println("Here are the ingredients for your pizza:");
		System.out.println(pepperoni.bread);
		System.out.println(pepperoni.sauce);
		System.out.println(pepperoni.cheese);
		System.out.println(pepperoni.topping); // null

	}

}
