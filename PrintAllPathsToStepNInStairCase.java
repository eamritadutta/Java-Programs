// climb 1 or 2 steps only at a time

import java.util.ArrayList;

public class PrintAllPathsToStepNInStairCase {
    
    public static void main(String[] args) {
	// printAllPathsToStepNInStairCase(3);
	printAllPathsToStepNInStairCase(6);
    }

    public static void printAllPathsToStepNInStairCase(int n) {
	
	int ones = n;
	int twos = 0;

	do {	    
	    // create a stack 
	    ArrayList<Integer> ints = new ArrayList<Integer>();
	    for (int i = 1; i<=ones ; i++) {
		ints.add(1);
	    }
	    for (int i = 1; i<=twos ; i++) {
		ints.add(2);
	    }
	    
	    // ints will always be sorted !!! 
	    allPermutationsWithRepeats(ints, 0);

	    ones = ones -2; // 1
	    twos ++; // 1
	    
	} while (ones >= 0);
    }

    private static void allPermutationsWithRepeats(ArrayList<Integer> arr, int index) {
	if (index == arr.size()) {	    
	    
	    for (int i = 0; i < arr.size(); i++) {
		System.out.print(arr.get(i) + " ");
	    }
	    System.out.println();
	    return;
	}
	
	

	for (int k = index; k < arr.size(); k++) {
	    int count = 0;
      
	    while (k != arr.size()-1 && arr.get(k) == arr.get(k+1)) {
		count++;
		k++;
	    }
	    int t;

	    if (index+1+count != arr.size()-1) {
	    t = arr.get(index);
	    arr.set(index, arr.get(k));
	    arr.set(k, t);
	    }
	    allPermutationsWithRepeats(arr, index+1+count);

	    if (index+1+count != arr.size()-1) {
	    t = arr.get(index);
	    arr.set(index, arr.get(k));
	    arr.set(k, t);
	    }
	} 
    }

    
}
