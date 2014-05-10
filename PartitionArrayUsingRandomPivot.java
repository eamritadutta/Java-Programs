/*
  // Interpreted output of this program: 
  
  // every int from 0 to 4 is in the smaller partition => 3, 1, 2, 0, 4

  // and every int in the range 5 to end of array (8) is in the larger partition => 7, 5, 11, 9

  The pivot index is: 4

  3 1 2 0 4 7 5 11 9 
*/

import java.util.Random;

public class PartitionArrayUsingRandomPivot {
    public static void main(String[] args) {
	int[] arr = {5, 1, 9, 4, 3, 7, 0, 11, 2};

	int startIndex = 0;
	int endIndex = arr.length -1;
	
	System.out.println();

	// now call method to partition this array
	int piv = partition(arr, startIndex, endIndex);

	System.out.println("The pivot index is: " + piv);
	System.out.println();
	
	// print the partitioned array by iterating the array using 
	// foreach style for loop !! 
	for (int x : arr) {
	    System.out.print(x + " ");
	}
	System.out.println();
    }

    public static int partition(int[] arr, int st, int end) {
	// generate a random pivot
	Random randGen = new Random();

	// the +1 here is necessary because if we use nextInt(n) 
	// then a random integer b/w 0 and n-1 is generated !! 

	// the +st is necessary for cases where st != 0
	int piv = randGen.nextInt(end - st + 1) + st;
	//int piv = 5;

	// swap the number at arr[0] with the number at arr[piv]
	arr[st] = arr[st] ^ arr[piv];
	arr[piv] = arr[st] ^ arr[piv];
	arr[st] = arr[st] ^ arr[piv];

	// start the partitioning loop
	int i = st +1;
	int j = end;
	
	while (i < j) {

	    while (arr[i] <= arr[st]) {
		i++;
		if (i == end) 
		    break;
	    }

	    while(arr[j] >= arr[st]) {
		j--;
		if (j==st) 
		    break;
	    }

	    if (i < j) {
		// swap arr[i] with arr[j]
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	    }
	}

	// swap with the pivot (viz. arr[st])
	arr[st] = arr[st] ^ arr[j];
	arr[j] = arr[st] ^ arr[j];
	arr[st] = arr[st] ^ arr[j];

	return j;
    }
}
