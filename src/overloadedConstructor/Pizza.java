package overloadedConstructor;

public class Pizza {
	String bread;
	String sauce;
	String cheese;
	String topping;


	Pizza(String bread, String sauce, String cheese, String topping) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}

	// overloaded constructor

	Pizza(String bread, String sauce, String cheese) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}

	Pizza(String bread, String sauce) {
		this.bread = bread;
		this.sauce = sauce;

	}

	public Pizza(String bread) {
		this.bread = bread;
	}

	public Pizza() {

	}
}
