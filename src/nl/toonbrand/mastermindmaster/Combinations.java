package nl.toonbrand.mastermindmaster;

import java.util.ArrayList;

public class Combinations {
	ArrayList<String> combinations = new ArrayList<>();

	public Combinations(String colors, int spots) {
		fillList(colors.toCharArray(), spots, "");
	}

	/*
	 * Fill a list with all possible color combinations using recursion
	 */
	void fillList(char[]colors, int spots, String start){
		if(start.length() >= spots){
			combinations.add(start);
		}else{
			for(char c : colors){
				fillList(colors, spots, start+c);
			}
		}
	}

	public ArrayList<String> getCombinations() {
		return combinations;
	}

	public void setCombinations(ArrayList<String> combinations) {
		this.combinations = combinations;
	}

	/*
	 * Remove possible combinations from Combinations
	 */
	public void removeCombinations(ArrayList<String> combinations){
		ArrayList<String> temp = new ArrayList<>(this.combinations);
		for(String s : this.combinations){
			for(String c : combinations){
				if(s.equals(c)){
					temp.remove(temp.indexOf(c));
				}
			}
		}
		this.combinations=temp;
	}

}
