// int[] arr = {2,3,5,12,20,15,10};

// in post order traveral, root is the last element in the array

// all elements less than 10 are in the left sub-tree

// all elements greater than 10 are in the right sub-tree 

public class CheckIfArrayIsPostOrderBST {
    public static void main(String[] args) {
	
	int[] arr = {30, 40,50,12,20,15,10};
	boolean isBST = checkIfBST(arr, 0, arr.length);
	if (isBST == true)
	    System.out.println("the array represents a post-order traversal of BST");
    }

    public static boolean checkIfBST(int[] arr, int st, int end) {
	System.out.println(st + " " + end);

	if (st == end) 
	    return true;

	System.out.println("end: " + end);

	int root = arr[end-1];//6

	// find the elements in the left subtree rooted at val 'root'
	int i = st;//0
	while (arr[i] < root) {
	    if (i == end - 1)//6 
		break;
	    i++;
	}// i = 3

	System.out.println("value of i after 1st while loop: " + i);

	int j = i;// j= 3 
	while (arr[j] > root) {
	    
	    if (j == end -1) // 6
		break;
	    j++;
	}

	if (j < end -1) {
	    System.out.println("Returning...");
	    return false;
	}
	else {
	boolean leftBST = true;
	if (i > 0)
	    leftBST = checkIfBST(arr, st, i); // 0, 3 
	boolean rightBST = true;
	if (i < end -1)
	    rightBST = checkIfBST(arr, i, end-1); // 3, 6
	
	return (leftBST && rightBST);
	}
    }
}
