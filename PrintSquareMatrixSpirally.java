public class PrintSquareMatrixSpirally {
    public static void main(String[] args) {
	int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	printSquareSpirally(arr1);

	int[][] arr2 = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16} };
	printSquareSpirally(arr2);
    }

    public static void printSquareSpirally(int[][] arr) {
	// since it is a square matrix, 
	// # rows = # cols
	int dim = arr.length; // 3

	int st = 0;
	
	while (st * 2 <= dim) {
	
	    for (int i = st; i < dim-st; i++) {
		System.out.print(arr[st][i] + " ");
	    }

	    if ((st + 1) * 2 <= dim) {
		int k;
		for (k = st+1; k <= dim - (st+1); k++) {
		    System.out.print(arr[k][dim-st-1] + " ");
		}
	    
		int j=1;
		k--;
		while (dim-st-1-j >= st) {
		    System.out.print(arr[k][dim-st-1-j] + " ");
		    j++;
		}

		j--;
		k--;
		while (k > st) { 
		    System.out.print(arr[k--][dim-st-1-j] + " ");
		}

	    } // end of if

	    st ++;

	} // end of while
	System.out.println();
    }
}
