package Yahtzee;

import java.util.Random;

public class Dice {
	
	int valueDice = 0;
	
	public void aleatoire() {
		Random random = new Random();
		valueDice = random.nextInt(5) + 1;
	}

}
