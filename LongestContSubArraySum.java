// this algorithm optimizes # of contiguous array elements choosen

// this algorithm returns the min of all -ve #s if all numbers are -ve in the array

public class LongestContSubArraySum {
    
    public static void main(String[] args) {
	int[] arr = {-1, -4, 9, 1, 3, -15, 6, 7, 8, -2};

	int greatestContSum = Integer.MIN_VALUE;

	int curSum = 0;

	for (int i = 0; i < arr.length; i++) {
	    if (curSum <= 0) 
		curSum = arr[i];
	    else 
		curSum += arr[i];

	    if (curSum > greatestContSum) 
		greatestContSum = curSum;
	}
	
	System.out.println("The greatest contiguous sum of the array is: " + greatestContSum);
    }
}
