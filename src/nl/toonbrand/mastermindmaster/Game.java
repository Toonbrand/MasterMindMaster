package nl.toonbrand.mastermindmaster;

public class Game {
	private static final int SPOTS = 4;
	private static final String[] COLORS = {"Blue", "Red", "Green", "Cyan", "Yellow", "Purple"};
	Combinations comb;
	
	/*
	 * Start the game
	 */
	public void play(){
		this.comb = new Combinations(COLORS, SPOTS);
		
	}
}
