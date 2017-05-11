package nl.toonbrand.mastermindmaster;

import java.util.ArrayList;

public class Combinations {
	ArrayList<ArrayList<String>> combinations = new ArrayList<>();

	public Combinations(String[] colors, int spots) {
		fillList(colors, spots, new ArrayList<String>());
	}

	/*
	 * Fill a list with all possible color combinations using recursion
	 */
	void fillList(String[] colors, int spots, ArrayList<String> start){
		if(start.size() >= spots){
			combinations.add(start);
		}else{
			for(String s : colors){
				ArrayList<String> ar = new ArrayList<>(start);
				ar.add(s);
				fillList(colors, spots, ar);
			}
		}
	}

	public ArrayList<ArrayList<String>> getCombinations() {
		return combinations;
	}

	public void setCombinations(ArrayList<ArrayList<String>> combinations) {
		this.combinations = combinations;
	}

	
}
