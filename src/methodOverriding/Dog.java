package methodOverriding;

public class Dog extends Animal {

	@Override
	void speak() {
		System.out.println("The dog goes *bark*");
	}
	// the method in the child class will be called instead of the same method
	// in the parents class

	// if the override method is removed it will use the closest method which is in
	// the parent class

}
