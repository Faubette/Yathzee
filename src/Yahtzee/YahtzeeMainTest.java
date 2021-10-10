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
	
	
	/**
	 * Quatrieme cas de test : UPPER COMBINATION Obtenez autant que possible de 4
	 * Instancie les 5 dés à 4 -> return 20. 
	 * Instancie 3 dés à 4 & 2 dés à 3 -> return 12.
	 */

	@Test
	void testUpperCombination_QUATRE() {
		
		YahtzeeMain yathzee = new YahtzeeMain();
		
		Dice dice[] = {new Dice(), new Dice(), new Dice(), new Dice(), new Dice()};
		
		for(Dice des : dice) {
			des.valueDice = 4;
		}
		assertEquals(20, yathzee.upperCombination_QUATRE(dice));
		
		/*---------------------CAS : 3 des à 4 & 2 des à 3 -------------------------------*/
		
		for (int i = 0; i<2; i++) {
			dice[i].valueDice = 3;
		}
		assertEquals(12, yathzee.upperCombination_QUATRE(dice));
	}
	
	/**
	 * Cinquieme cas de test : UPPER COMBINATION Obtenez autant que possible de 5
	 * Instancie les 5 dés à 5 -> return 25. 
	 * Instancie 3 dés à 5 & 2 dés à 3 -> return 15.
	 */

	@Test
	void testUpperCombination_CINQ() {
		
		YahtzeeMain yathzee = new YahtzeeMain();
		
		Dice dice[] = {new Dice(), new Dice(), new Dice(), new Dice(), new Dice()};
		
		for(Dice des : dice) {
			des.valueDice = 5;
		}
		assertEquals(25, yathzee.upperCombination_CINQ(dice));
		
		/*---------------------CAS : 3 des à 5 & 2 des à 4 -------------------------------*/
		
		for (int i = 0; i<2; i++) {
			dice[i].valueDice = 3;
		}
		assertEquals(15, yathzee.upperCombination_CINQ(dice));
	}
	
	/**
	 * Sixiemecas de test : UPPER COMBINATION Obtenez autant que possible de 5
	 * Instancie les 5 dés à 6 -> return 30. 
	 * Instancie 3 dés à 6 & 2 dés à 3 -> return 15.
	 */

	@Test
	void testUpperCombination_SIX() {
		
		YahtzeeMain yathzee = new YahtzeeMain();
		
		Dice dice[] = {new Dice(), new Dice(), new Dice(), new Dice(), new Dice()};
		
		for(Dice des : dice) {
			des.valueDice = 6;
		}
		assertEquals(30, yathzee.upperCombination_SIX(dice));
		
		/*---------------------CAS : 3 des à 6 & 2 des à 4 -------------------------------*/
		
		for (int i = 0; i<2; i++) {
			dice[i].valueDice = 3;
		}
		assertEquals(18, yathzee.upperCombination_SIX(dice));
	}
}
