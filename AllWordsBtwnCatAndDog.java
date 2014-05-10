// this class prints all the words required to go from "tree" to "flat" !!

// the dictionary contains all 4 letter words !! 

import java.util.*;

public class AllWordsBtwnCatAndDog {
    public static void main(String[] args) {
	
	// create the dictinary of words
	Set<String> dict = new HashSet<String>();

	String[] strings = {"maps", "tan", "tree", "apple", "cans", "help", "aped", "free", "apes", "flat", "trap", "fret", "trip", "trie", "frat", "fril"};
    
	for (String str : strings)
	    dict.add(str);

	ArrayList<String> path = new ArrayList<String>();

	// add the start word to path !! 
	path.add("tree");

	getWords("tree", "flat", dict, path);

	// print the words in going from tree to flat !! 
	for (String s : path) 
	    System.out.println(s);
    }

    public static ArrayList<String> getWords(String start, String end, HashSet<String> dict, ArrayList<String> path) {
	

	for (int i = 0; i < start.length(); i++) {
	    // gives me 't'
	    char c = path.get(path.size() -1).charAt(i);
	    
	    for (int j = 1; j <= 26; j++) {
		
	    } 
	}
    }
}
