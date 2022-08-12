package constructor;

public class Human {

	String name;
	int age;
	double weigth;

	Human(String name, int age, double weight) {

		this.name = name;
		this.age = age;
		this.weigth = weight;

		// the point of constructor is that it allows us to store varying
		// attributes for different objects



	}

	// access an object attributes from within its own class, lets say you want to
	// say
	// a user is eating
	void eat() {
		System.out.println(this.name + " is eating");
	}

	void drink() {
		System.out.println(this.name + " is drinking");
	}


}
