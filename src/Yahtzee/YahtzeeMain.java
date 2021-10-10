package Yahtzee;

public class YahtzeeMain {

	public static void main(String[] args) {
		Dice dice = new Dice();

	}
	
	/*
	 * UPPER COMBINATION
	 */
	
	/*
	 * Generer des nombre aléatoire dans les 5 dés
	 */

	public int getNumberOfDice(Dice dice[], int value) {
		int count = 0;

		for (Dice des : dice) {
			if (des.valueDice == value) {
				count += 1;
			}
		}
		return count;
	}


	/*
	 * Combinaison de 1 autant que possible (max 5 des )
	 */

	public int upperCombination_UN(Dice[] dice) {

		int count = 0;

		for (Dice des : dice) {
			if (des.valueDice == 1) {
				count += 1;
			}
		}
		return count;
	}

	/*
	 * Combinaison de 2 autant que possible (max 5 des )
	 */
	public int upperCombination_DEUX(Dice dice[]) {
		int count = 0;

		for (Dice des : dice) {
			if (des.valueDice == 2) {
				count += 2;
			}
		}

		return count;

	}

	/*
	 * Combinaison de 3 autant que possible (max 5 des )
	 */
	public int upperCombination_TROIS(Dice dice[]) {
		int count = 0;

		for (Dice des : dice) {
			if (des.valueDice == 3) {
				count += 3;
			}
		}

		return count;

	}
	
	/*
	 * Combinaison de 4 autant que possible (max 5 des )
	 */
	public int upperCombination_QUATRE(Dice dice[]) {
		int count = 0;

		for (Dice des : dice) {
			if (des.valueDice == 4) {
				count += 4;
			}
		}

		return count;

	}
	
	/*
	 * Combinaison de 5 autant que possible (max 5 des )
	 */
	public int upperCombination_CINQ(Dice dice[]) {
		int count = 0;

		for (Dice des : dice) {
			if (des.valueDice == 5) {
				count += 5;
			}
		}

		return count;

	}
	
	/*
	 * Combinaison de 6 autant que possible (max 5 des )
	 */
	public int upperCombination_SIX(Dice dice[]) {
		int count = 0;

		for (Dice des : dice) {
			if (des.valueDice == 6) {
				count += 6;
			}
		}

		return count;

	}
	
	/*-------------------------------------------------------------------------*/
	
	/*
	 * LOWER COMBINATION
	 */
	
	/*
	 * Combinaison BRELAN
	 */
	public int lowerCombinaison_BRELAN(Dice dice[]) {
		int count = 0;
		boolean isBrelan = false;

		for (Dice des : dice) {
			if (getNumberOfDice(dice, des.valueDice) == 3) {
				isBrelan = true;
			}
			count += des.valueDice;
		}
		if (isBrelan == true) {
			return count;
		} else {
			return 0;
		}

	}
}
