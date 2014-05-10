// generate a random integer b/w 0 and len

// generate a random integer b/w 1 and len

import java.lang.Math;

public class ShuffleArray {
    public static void main(String[] args) {
	int[] toShuffle = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

	shuffle(toShuffle);

	for (int i : toShuffle) 
	    System.out.println(i);
    }

    public static void shuffle(int[] arr) {
	int len = arr.length;

	for (int i=0; i < len; i++) {
	    int r = ((int) (Math.random() * (len-i))) + i;
	    // swap
	    int t = arr[i];
	    arr[i] = arr[r];
	    arr[r] = t;
	}
    }
}
