package nl.toonbrand.mastermindmaster;

public class Game {
	private final int SPOTS = 4;
	final String COLORS = "123456";
	Combinations comb;

	public Game(){
		this.comb = new Combinations(COLORS, SPOTS);
	}
	
	public void play(){
		
	}
}
