// The following program finds duplicates in an array of N numbers viz. a[0..N-1] where
// the numbers are in range [0..N-1] but some numbers are missing and some duplicated


// since I am writing this code for interview practise, 
// I will always check for the sanity of inputs provided to my function

// I will also add unit tests to my code

public class FindDuplicates {
    // main is my tester
    public static void main(String[] args) {
	// 1st test
	// array from 0 to 7 i.e. size of array = 8
	int[] input1 = {3, 2, 1, 0, 3, 4, 2, 5};
	// Any duplicate # in the array input1 is returned e.g. 3 or 2
	int dup = findDuplicates(input1);
	System.out.println("Duplicate number: " + dup);

	// 2nd test
	// array from 0 to 7 i.e. size of array = 8
	// notice the lack of 0's in the array
	// the code in the solver method findDuplicates still works !! 
	int[] input2 = {2, 2, 1, 5, 3, 4, 2, 5};
	// Any duplicate # in the array input1 is returned e.g. 3 or 2
	dup = findDuplicates(input2);
	System.out.println("Duplicate number: " + dup);

	// 3rd test
	// no duplicates 
	int[] input3 = {2, 7, 1, 5, 3, 4, 6, 0};
	// Any duplicate # in the array input1 is returned e.g. 3 or 2
	dup = findDuplicates(input3);
	System.out.println("Duplicate number: " + dup);
    }

    public static int findDuplicates(int[] a) {
	int len = a.length;
	for (int i=0; i<len;) {
	    // sanity check of input
	    // if any # is >= len => violates input condition

	    // also check, if any number in the i/p array a 
	    // in -ve or not, no entry in the array can be negative per the
	    // problem def.

	    if (a[i] != i) {
		int temp = a[i]; // i=0 => a[0]=3

		// check m=a[i] w/ a[m] or in other words a[a[i]]
		if (a[i] == a[temp]) {
		    // we have found a duplicate
		    return a[i];
		}
		// swap with a[i] = m with a[m]
		// since m should be at a[m]
		
		a[i] = a[temp]; // i=0 => a[0] = a[3] = 0
		a[temp] = temp;
	    } 
	    if (a[i] == i) {
		i++;
	    }
	}
	// no duplicates found 
	return -1;
    }
}
