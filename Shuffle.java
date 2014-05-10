// shuffles an array of N integers using GenerateRandom.java

import java.lang.Comparable;

public class Shuffle {
    
    public static void shuffleArray(Comparable[] inputArray) {
	int N = inputArray.length;

	for (int i = 0; i < N; i++) {
	    int r = i + GenerateRandom.uniform(N-i);

	    Comparable temp = inputArray[i];
	    inputArray[i] = inputArray[r];
	    inputArray[r] = temp;
	}
    } 
}
