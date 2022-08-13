package accessModifiers;

public class A {

	// anything that is public is visible to other packages within the project

	public static void main(String[] args) {
		B b = new B();
//		System.out.println(b.privateMessage); 

		// cannot be accessed outside of the class it is declared
	}

}
