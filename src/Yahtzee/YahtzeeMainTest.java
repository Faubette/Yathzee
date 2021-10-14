package Yahtzee;

import static org.junit.Assert.assertEquals;
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
	
	/**
	 * Cas BRELAN : 3 des identiques
	 */
	
	@Test
	void testLowerCombinaison_BRELAN() {
		YahtzeeMain yathzee = new YahtzeeMain();

		Dice dice[] = { new Dice(), new Dice(), new Dice(), new Dice(), new Dice() };
		for (int i = 0; i < 5; i++) {
			if (i < 3) {

				dice[i].valueDice = 3;

			} else {
				dice[i].valueDice = 2;
			}
		}
		assertEquals(13, yathzee.lowerCombinaison_BRELAN(dice));

		for (int i = 0; i < 5; i++) {
			if (i < 3) {

				dice[i].valueDice = 5;

			} else {
				dice[i].valueDice = 4;
			}
		}
		assertEquals(23, yathzee.lowerCombinaison_BRELAN(dice));
	}
	
	/**
	 * Cas Four of Kind : 4 indentiques -> sum de tous les dés
	 */
	
	@Test
	void lowerCombinaison_Four_of_Kind() {
		YahtzeeMain yathzee = new YahtzeeMain();

		Dice dice[] = { new Dice(), new Dice(), new Dice(), new Dice(), new Dice() };
		for (int i = 0; i < 5; i++) {
			if (i < 4) {

				dice[i].valueDice = 4;

			} else {
				dice[i].valueDice = 2;
			}
		}
		assertEquals(18, yathzee.lowerCombinaison_Four_Of_Kind(dice));

		for (int i = 0; i < 5; i++) {
			if (i < 4) {

				dice[i].valueDice = 3;

			} else {
				dice[i].valueDice = 4;
			}
		}
		assertEquals(16, yathzee.lowerCombinaison_Four_Of_Kind(dice));
	}

	@Test
	void lowerCombinaison_Full_House() {
		YahtzeeMain yathzee = new YahtzeeMain();

		Dice dice[] = { new Dice(), new Dice(), new Dice(), new Dice(), new Dice() };
		for (int i = 0; i < 5; i++) {
			if (i < 3) {

				dice[i].valueDice = 4;

			} else {
				dice[i].valueDice = 2;
			}
		}
		assertEquals(25, yathzee.lowerCombinaison_Full_House(dice));

		for (int i = 0; i < 5; i++) {
			if (i < 3) {

				dice[i].valueDice = 3;

			} else if (i == 4) {
				dice[i].valueDice = 4;
			} else {
				dice[i].valueDice = 5;
			}
		}
		assertEquals(0, yathzee.lowerCombinaison_Full_House(dice));
	}
	
	@Test
	void lowerSmallStraight() {
		YahtzeeMain yathzee = new YahtzeeMain();
		Dice dice[] = { new Dice(), new Dice(), new Dice(), new Dice(), new Dice() };
		
		//La Sequence est 1, 2, 3, 4, (6) 
		for(int i = 0; i<5; i++) {
			if(i<4) {
				dice[i].valueDice = i + 1;
			} else{
				dice[i].valueDice = 6;
			}
		}
		assertEquals(30, yathzee.lowerSmallStraight(dice));
		
		//La Sequence est (6), 1, 2, 3, 4 
		for(int i = 0; i<5; i++) {
			if(i>0) {
				dice[i].valueDice = i;
			} else{
				dice[i].valueDice = 6;
			}
		}
		assertEquals(30, yathzee.lowerSmallStraight(dice));
		
		//La Sequence est  2, 3, 4, 5, (1)
		for(int i = 0; i<5; i++) {
			if(i<4) {
				dice[i].valueDice = i + 2;
			} else{
				dice[i].valueDice = 1;
			}
		}
		assertEquals(30, yathzee.lowerSmallStraight(dice));
		
		//La Sequence est  (6) 2, 3, 4, 5
		for(int i = 0; i<5; i++) {
			if(i>0) {
				dice[i].valueDice = i + 1;
			} else{
				dice[i].valueDice = 6;
			}
		}
		assertEquals(30, yathzee.lowerSmallStraight(dice));
		
		//La Sequence est  (6), 3, 4, 5, 6
			for(int i = 0; i<5; i++) {
				if(i>0) {
					dice[i].valueDice = i + 2;
				} else{
					dice[i].valueDice = 6;
				}
			}
			assertEquals(30, yathzee.lowerSmallStraight(dice));
			
			//La Sequence est  3, 4, 5, 6, (1)
			for(int i = 0; i<5; i++) {
				if(i<4) {
					dice[i].valueDice = i + 3;
				} else{
					dice[i].valueDice = 1;
				}
			}
			assertEquals(30, yathzee.lowerSmallStraight(dice));
			
			//Pas de séquence
			for(int i = 0; i<5; i++) {
				dice[i].valueDice = 1;
			}
			assertEquals(0, yathzee.lowerSmallStraight(dice));
	}
	


}