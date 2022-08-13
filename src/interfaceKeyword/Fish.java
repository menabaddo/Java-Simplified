package interfaceKeyword;

public class Fish implements Prey, Predator {

	@Override
	public void hunt() {
		System.out.println("Fish is hunting smaller fish");

	}

	@Override
	public void flee() {
		System.out.println("Fish is fleeing from a larger fish");

	}

	// you can add more than one interface to a class
	// for instance a fish can be a prey and a predators

}
