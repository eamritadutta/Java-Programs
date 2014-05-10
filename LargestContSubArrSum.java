// ArrayList in java permits 'null' as one of its elements

// The size, isEmpty, get, set, iterator, and listIterator operations run in constant time.

// components of an ArrayList cannot be accessed using integer indexes like in an array

// if we want to access components of a "growable" list using array indexes use: java.util.Vector

// diff b/w vector and array list is that vector is synchronized but array list is not

//import java.util.ArrayList;

public class LargestContSubArrSum {
    public static void main(String[] args) {
	//java.
	int[] input = {1, -2, 3, 10, -4, 7, 2, -5};
	
	// keep track of present sum
	int presentSum = input[0];

	int start = 0;
	int end = 0;
	
	// keep track of max sum seen so far
	int maxSum = input[0];

	// obviously we will have to check each elem
	// in the array so hv a loop
	for (int i=1; i<input.length; i++) {
	    if(input[i] + presentSum  > input[i]) {
		presentSum += input[i];
		if (presentSum > maxSum) {
		    end = i;
		    maxSum = presentSum;
		}		
	    }
	    else { // discard everything to the left
		presentSum = input[i];
		maxSum = input[i];
		start = i;
		end = i;
	    }
	}

	for (int i = start; i<=end; i++)
	    System.out.print(input[i] + " ");
	System.out.println();
    }
}
