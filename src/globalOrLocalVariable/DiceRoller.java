package globalOrLocalVariable;

import java.util.Random;

public class DiceRoller {

	int number = 0;
	Random random = new Random();

	DiceRoller() {
		int number = 0;// local
		Random random = new Random(); // local
		rollDice(); // could be made available in the rollDice method by passing it as an argument

	}

	void rollDice() {

		number = random.nextInt(6) + 1;
		System.out.println(number);

	}

}
