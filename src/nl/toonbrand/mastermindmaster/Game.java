package nl.toonbrand.mastermindmaster;

import java.util.ArrayList;

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
		
	/*
	 * Gives a response in black and white pins based on an attempt and solution
	 */
	public String judgeAttempt(ArrayList<String> attempt, ArrayList<String> solution){
		String judgement = "";
		
		/*
		 * check for white pins
		 */
		for(int i=0;i<attempt.size();i++){
			if(attempt.get(i).equals(solution.get(i))){
				judgement=judgement+"w";
				attempt.remove(i);
				solution.remove(i);
				i--;
			}
		}
		
		/*
		 * check for black pins
		 */
		for(int i=0;i<attempt.size();i++){
			for(int j=0;j<solution.size();j++){
				if(attempt.get(i).equals(solution.get(j))){
					judgement=judgement+"b";
					attempt.remove(i);
					solution.remove(j);
					i--;
					j--;
				}
			}
		}
		return judgement;
	}
}
