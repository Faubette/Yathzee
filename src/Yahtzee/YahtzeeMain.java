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

	/*
	 * Combinaison Four of Kind
	 */
	public int lowerCombinaison_Four_Of_Kind(Dice dice[]) {
		int count = 0;
		boolean isFourOfKind = false;

		for (Dice des : dice) {
			if (getNumberOfDice(dice, des.valueDice) == 4) {
				isFourOfKind = true;
			}
			count += des.valueDice;
		}
		if (isFourOfKind == true) {
			return count;
		} else {
			return 0;
		}

	}

	/*
	 * Combinaison Full House
	 */
	public int lowerCombinaison_Full_House(Dice dice[]) {
		boolean isBrelan = false;
		boolean isPair = false;

		for (Dice des : dice) {
			if (getNumberOfDice(dice, des.valueDice) == 3) {
				isBrelan = true;
			}
			if (getNumberOfDice(dice, des.valueDice) == 2) {
				isPair = true;
			}

		}
		if (isBrelan && isPair) {
			return 25;
		} else {
			return 0;
		}

	}

	/*
	 * Combinaison Small Straight
	 */
	public int lowerSmallStraight(Dice dice[]) {
		int sequenceStart[] = { dice[0].valueDice, 1, 2, 3, 4 };
		int sequenceEnd[] = { 1, 2, 3, 4, dice[4].valueDice };
		int sequence2Start[] = { dice[0].valueDice, 2, 3, 4, 5 };
		int sequence2End[] = { 2, 3, 4, 5, dice[4].valueDice };
		int sequence3Start[] = { dice[0].valueDice, 3, 4, 5, 6 };
		int sequence3End[] = { 3, 4, 5, 6, dice[4].valueDice };
		boolean isSequence = true;

		for (int i = 0; i < 5; i++) {
			if (sequenceStart[i] != dice[i].valueDice) {
				isSequence = false;
				break;
			}
		}
		if (isSequence == true) {
			return 30;
		}

		isSequence = true;
		for (int i = 0; i < 5; i++) {
			if (sequenceEnd[i] != dice[i].valueDice) {
				isSequence = false;
				break;
			}
		}
		if (isSequence == true) {
			return 30;
		}
		// Sequence 2
		isSequence = true;
		for (int i = 0; i < 5; i++) {
			if (sequence2Start[i] != dice[i].valueDice) {
				isSequence = false;
				break;
			}
		}
		if (isSequence == true) {
			return 30;
		}

		isSequence = true;
		for (int i = 0; i < 5; i++) {
			if (sequence2End[i] != dice[i].valueDice) {
				isSequence = false;
				break;
			}
		}
		if (isSequence == true) {
			return 30;
		}

		// Sequence 3
		isSequence = true;
		for (int i = 0; i < 5; i++) {
			if (sequence3Start[i] != dice[i].valueDice) {
				isSequence = false;
				break;
			}
		}
		if (isSequence == true) {
			return 30;
		}

		isSequence = true;
		for (int i = 0; i < 5; i++) {
			if (sequence3End[i] != dice[i].valueDice) {
				isSequence = false;
				break;
			}
		}
		if (isSequence == true) {
			return 30;
		}
		return 0;
	}
}
	
