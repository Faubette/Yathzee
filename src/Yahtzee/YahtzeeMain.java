package Yahtzee;

public class YahtzeeMain {

	public static void main(String[] args) {
		Dice dice = new Dice();

	}
	
	/*
	 * Generer des nombre aléatoire dans les 5 dés
	 */
	
	public int getNumberOfDice(Dice dice[], int value) {
		int count = 0; 
		
		for (Dice des : dice) {
			if(des.valueDice == value) {
				count += 1;
			}
		}
		return count;
	}
	
	/*-------------------------------------------------------------------------*/
	
	/*
	 * Combinaison de 1 autant que possible (max 5 des )
	 */

	public int upperCombination_UN(Dice[] dice) {
		
		int count = 0;
		
		for (Dice des :dice) {
			if(des.valueDice == 1) {
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
}
