// this class only the first solution to the NQueens problem
public class NQueens {
    
    private static int[] pos = new int[4];
    
    private static boolean getConflict(int loc) {
	// create a 2 d array out of 'pos'
	boolean[][] arr = new boolean[4][4];

	pos[0] = 2;
	pos[1] = 0;
	pos[2] = 3;
	pos[3] = 1;
	for (int i = 0; i < 4; i++) {
	    for (int j = 0; j < 4; j++) {
		if (pos[i] == false) {
		    arr[i][j] = false;
		} else {
		    arr[i][j] = true;
		}
	    }
	}

	for (int i = 0; i < 4; i++) {	
	    for (int j = 0; j < 4; j++) {
		System.out.print(arr[i][j] + " ");
	    }
	    System.out.println();
	}

	return false;
    }
    
    private static boolean x(int i) {
	
	for(int j = i; j < 4; j++) {
	    
	}


	return false;
    }

    private static int[] getNonAttackingQueenPositions() {
	//int[] pos = new int[4];
	int[] indices = {0,1,2,3};
	for (int i : indices) {
	    pos[i] = -1;
	}
	
	for (int i : indices) {
	    
	}

	return pos;
    }

    public static void main(String[] args) {
	// this is a specific case of the problem 
	// solving for 4 x 4 board only for now
	NQueens test = new NQueens();
	
	// pos[0] = row in which the Queen of column 0 is placed at
	// pos[1] = row in which the Queen of column 1 is placed at
	// pos[2] = row in which the Queen of column 2 is placed at
	// pos[3] = row in which the Queen of column 3 is placed at
	
  	int[] pos = getNonAttackingQueenPositions();
	/*System.out.println("The non attacking positions on a 4 x 4 chess board are as follows: ");
	for (int i : pos) {
	    System.out.print(i + " ");
	}
	System.out.println();*/

	boolean ret = getConflict(2);
    }
}