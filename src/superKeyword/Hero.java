package superKeyword;


public class Hero extends Person {
	String power;

	Hero(String name, int age, String power) {
		super(name, age); // this values will be passed to the Person class constructor

		this.power = power;
	}

	@Override
	public String toString() {
		return super.toString() + this.power;
	}
}
