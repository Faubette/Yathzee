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

		/*---------------------CAS : 3 des à 1 & 2 des à 4 -------------------------------*/

		for (int i = 0; i < 2; i++) {
			dice[i].valueDice = 4;
		}
		assertEquals(3, yathzee.upperCombination_UN(dice));

	}
	
	/**
	 * Deuxiem cas de test : UPPER COMBINATION Obtenez autant que possible de 2
	 * Instancie les 5 dés à 2 -> return 10. 
	 * Instancie 3 dés à 2 & 2 dés à 4 -> return 6.
	 */
	
	@Test
	void testUpperCombination_DEUX() {
		
		YahtzeeMain yathzee = new YahtzeeMain();
		
		Dice dice[] = {new Dice(), new Dice(), new Dice(), new Dice(), new Dice()};
		
		for(Dice des : dice) {
			des.valueDice = 2;
		}
		assertEquals(10, yathzee.upperCombination_DEUX(dice));
		
		/*---------------------CAS : 3 des à 2 & 2 des à 4 -------------------------------*/
		
		for (int i = 0; i<2; i++) {
			dice[i].valueDice = 4;
		}
		assertEquals(6, yathzee.upperCombination_DEUX(dice));
	}
	
	/**
	 * Troisieme cas de test : UPPER COMBINATION Obtenez autant que possible de 3
	 * Instancie les 5 dés à 3 -> return 15. 
	 * Instancie 3 dés à 3 & 2 dés à 4 -> return 9.
	 */

	@Test
	void testUpperCombination_TROIS() {
		
		YahtzeeMain yathzee = new YahtzeeMain();
		
		Dice dice[] = {new Dice(), new Dice(), new Dice(), new Dice(), new Dice()};
		
		for(Dice des : dice) {
			des.valueDice = 3;
		}
		assertEquals(15, yathzee.upperCombination_TROIS(dice));
		
		/*---------------------CAS : 3 des à 3 & 2 des à 4 -------------------------------*/
		
		for (int i = 0; i<2; i++) {
			dice[i].valueDice = 4;
		}
		assertEquals(9, yathzee.upperCombination_TROIS(dice));
	}
}
