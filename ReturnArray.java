public class ReturnArray {
    public static void main(String[] args) {
	int[] ret = getArray();

	double x = 4.0;
	double y = x/2;
	System.out.println(y);

	for (int i = 0; i < ret.length; i++) {
	    System.out.println(ret[i] + " ");
	}
    }

    public static int[] getArray() {
	int[] arr = {1, 2, 3, 4};
	return arr;
    }
}
