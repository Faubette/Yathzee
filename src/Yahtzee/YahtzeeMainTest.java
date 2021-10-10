package Yahtzee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class YahtzeeMainTest {

	/**
	 * Premier cas de test : UPPER COMBINATION Obtenez autant que possible de 1
	 * Instancie les 5 dés à 1 -> return 5. 
	 * Instancie 3 dés à 1 & 2 dés à 4 -> return 3.
	 */

	@Test
	void testUpperCombination_UN() {
		YahtzeeMain yathzee = new YahtzeeMain();

		Dice dice[] = { new Dice(), new Dice(), new Dice(), new Dice(), new Dice() };

		for (Dice des : dice) {
			des.valueDice = 1;
		}

		assertEquals(5, yathzee.upperCombination_UN(dice));

		/*-------------------------------------------------------------------------*/

		for (int i = 0; i < 2; i++) {
			dice[i].valueDice = 4;
		}
		assertEquals(3, yathzee.upperCombination_UN(dice));

	}

}
