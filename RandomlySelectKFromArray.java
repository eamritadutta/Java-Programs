public class RandomlySelectKFromArray {
    public static void main(String[] args) {
	int[] arr = {3, 1, 9, 2, 8, 7, 6};
	int k = 4;

	// selecting 4 from an arr ! 

	int[] selected = selectRandomly(arr, k);
	
	// test printing an array using for - each construct in java
	for (int a : selected) 
	    System.out.println(a);
    }

    public static int[] selectRandomly(int[] arr, int k) {
	
	// create new array which I intend to use as the return
	int[] subSet = new int[k];

	// clone orignial, so that we can overwrite the original
	int[] cloned = arr.clone();

	for (int j = 0; j < k; j++) {
	    // generate random index from j to arr.length -1
	    int x = genRandIndex(j, arr.length - 1);
	    subSet[j] = cloned[x];

	    // swap selected with x to mark
	    cloned[x] = cloned[j];
	}

	return subSet;
    }

    public static int genRandIndex(int lo, int hi) { // say, array has 10 elements
	int x = lo + (int) (Math.random() * (hi + 1 - lo)); // .9 * (9 + 1) => .9 * 10 = 9 - CAN'T ADD LOWER IN THIS CASE
	return x;
    }
}
