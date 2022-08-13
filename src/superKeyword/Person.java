package superKeyword;

public class Person {

	String name;
	int age;

	Person(String name, int age) {

		// this takes care of the assignment for the name and age

		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name + "\n" + this.age + "\n";
	}

}
