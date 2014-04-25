import java.util.Comparator;
import java.util.Scanner;

public class Selection {
    
    // selection sort
    /*
    public static void sort(Comparable[] a) {
	int N = a.length;
	
	for (int i=0; i<N; i++) {
	    int min = i;
	    for (int j=i+1; j<N; j++)
		if (less(a[j], a[min]))
		    min = j;
	    exch(a, i, min);
	    assert isSorted(a, 0, i);
	}
	assert isSorted(a);
    }

    /*************************
     * Helper sorting functions
     *************************/
    
    // is v < w
    /*private static boolean less(Comparable v, Comparable w) {
	return (v.compareTo(w) < 0);
    }

    // exchange a[i] and a[j]
    private static void exch(Object[] a, int i, int j) {
	Object swap = a[i];
	a[i] = a[j];
	a[j] = swap;
    }

    // is the array a[] sorted?
    private static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }
        
    // is the array sorted from a[lo] to a[hi]
    private static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

    // print the array to standard output
    private static void show(Comparable[] a) {
	for (int i=0; i<a.length; i++)
	    System.out.println(a[i]);
	    }*/
						
    // main
    public static void main(String[] args) {
	System.out.println("Blah...");
	/*
	Scanner s = new Scanner(System.in);
	int len = 0;

	System.out.println("Enter the number of elements in the array you want to sort");
	if (s.hasNextInt())
	    len = s.nextInt();
	
	String[] arrayToSort = new String[len];
	int i=0;

	System.out.println("Enter the number of elements of the array");
	while (s.hasNext())
	    arrayToSort[i++] = s.next();

	Selection.sort(arrayToSort);
	show(arrayToSort);*/
    }
}
