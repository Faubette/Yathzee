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
	

	public int upperCombination_UN(Dice[] dice) {
		
		int count = 0;
		
		for (Dice des :dice) {
			if(des.valueDice == 1) {
				count += 1;
			}
		}
		return count;
	}
	
}
