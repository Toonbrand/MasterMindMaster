package nl.toonbrand.mastermindmaster;

import java.util.ArrayList;

public class Game {
	private static final int SPOTS = 4;
	private static final String COLORS = "brgcyp";
	Combinations comb;
	
	/*
	 * Start the game
	 */
	public void play(){
		this.comb = new Combinations(COLORS, SPOTS);
		
		ArrayList<String> test = new ArrayList<>();
		test.add("bbbb");
		comb.removeCombinations(test);
		System.out.println(comb.getCombinations());
		System.out.println(judgeAttempt("aadd", "adad"));
	}
		
	/*
	 * Gives a response in black and white pins based on an attempt and solution
	 */
	public String judgeAttempt(String attempt, String solution){
		String judgement, attemptB, solutionB;
		judgement = attemptB = solutionB = "";
		
		/*
		 * check for white pins
		 */
		for(int i=0;i<attempt.length();i++){
			if(attempt.charAt(i)==(solution.charAt(i))){
				judgement=judgement+"w";
			}
			else{
				attemptB=attemptB+attempt.charAt(i);
				solutionB=solutionB+solution.charAt(i);
			}
		}
				
		/*
		 * check for black pins
		 */
		 for (int i = 0; i < attemptB.length(); i++) {
	            char ch = attemptB.charAt(i);
	             if (solutionB.indexOf(ch) != -1){
	                 judgement=judgement+"b";
	             }
	        }
		return judgement;
	}
}
