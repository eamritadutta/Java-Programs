// apply binary search to search a given number in a sorted matrix
// the search function returns true if the number is found, false otherwise

public class SearchSorted2DMatrix {
    
    public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	
	if (sc.hasNextInt()) {
	    int s = sc.nextInt();

	    // 2 x 5 matrix
	    // remember specifying #rows in a 2D matrix is compulsory
	    // #cols may or maynot be specified !! 
	
	    // indices in the matrix will range from 
	    // r = 0 to 1 and 
	    // c = 0 to 4
	    int[][] arr = {{1,3,5,7,9}, {11,13,15,17,19}};
	
	    // searching for user input 's' in 'arr'
	    boolean found = searchMatrix(arr, s);
	    if (found)
		System.out.println("The number is found in the matrix:");
	    else 
		System.out.println("The number is not found in the matrix:");

	    // merely for practise: print the 2D matrix
	    for (int i=0; i < 2; i++) {
		for (int j=0; j < 5; j++)
		    System.out.print(" " + arr[i][j] + " ");
		System.out.println();
	    }
	}
    }

    public static boolean searchMatrix(int[][] arr, int val) {
	// # rows = arr.length since arr is a 1D array of arrays containing
	// # elements = # cols.
	int r = arr.length;
	// # cols = len of any arr[i] since this is not a skwed matrix
	int c = arr[0].length;

	int st = 0; // 0 to
	int end = r * c -1; // 9 (= 2 * 5 -1 = 10 -1)

	while(st<=end) {
	    int mid = st + (end-st)/2; // 4 = 0 + 9/2 
	    int row = mid / c;
	    int col = mid % c;
	    int midVal = arr[row][col];
		
	    if (val == midVal) 
		return true;

	    if (val > midVal)
		st = mid + 1;
	    else 
		end = mid - 1;
	}
	return false;
    }
}
