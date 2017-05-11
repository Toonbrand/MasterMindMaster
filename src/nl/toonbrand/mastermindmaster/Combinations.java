package nl.toonbrand.mastermindmaster;

import java.util.ArrayList;

public class Combinations {
	ArrayList<String> combinations = new ArrayList<>();

	public Combinations(String colors, int spots) {
		fillList(colors.toCharArray(), spots, "");
	}

	void fillList(char[] c, int n, String start){
		if(start.length() >= n){
			combinations.add(start);
		}else{
			for(char x : c){ // not a valid syntax in Java
				fillList(c, n, start+x);
			}
		}
	}

	public ArrayList<String> getCombinations() {
		return combinations;
	}
	
	public void setCombinations(ArrayList<String> combinations) {
		this.combinations = combinations;
	}
}
