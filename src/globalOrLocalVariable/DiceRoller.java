package globalOrLocalVariable;

import java.util.Random;

public class DiceRoller {

	int number; // global
	Random random; // global

	DiceRoller() {
		random = new Random();
		int number = 0;// local not used
		Random random = new Random(); // local not used
		rollDice(); // could be made available in the rollDice method by passing it as an argument

	}

	void rollDice() {

		number = random.nextInt(6) + 1;
		System.out.println(number);

	}

}
