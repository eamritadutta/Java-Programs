// this sorting api can be used for any item type that implements the Comparable<T> interface. (see java api docs!)

// For our own types, we can enable client code to sort that type of data by defining the compareTo()
// that defines an ordering on objects of that type known as the natural order for that type ! 

// Many of the types we want to sort implements Comparable interface. 

// java's built-in numeric types Integer and double implement Comparable
// as do String and other java types such as Files and URL.

// so we can call the sort method by passing an array of any of these types as argument. 

// As an example: the code below uses quicksort

// Double a[] = new Double[N];
// for (int i - 0; i< N; i++)
//   a[i] = Random.number();
// Quick.sort(a);

import java.util.Scanner;

// SortingSkeleton will be replaced by the class name
// corresponding to the name of the sort
// Eg: public class Selection

public class SortingSkeleton {
    
    // Note: the sort() method is static 
    public static void sort(Comparable[] a) {
	// will be different for each different sorting algorithm
    }

    private static boolean less(Comparable v, Comparable w) {
	return v.compareTo(w) < 0;
    }
    
    private static void exch(Comparable[] a, int i, int j) {
	Comparable t = a[i];
	a[i] = a[j];
	a[j] = t;
    }
    
    private static void show(Comparable[] a) {
	for (int i=0; i< a.length; i++) 
	    System.out.print(a[i] + " ");
	  
	System.out.println();
    }

    public static boolean isSorted(Comparable[] a) {
	for (int i = 1; i < a.length; i++)
	    if (less(a[i], a[i-1])) return false;
	
	return true;
    }
    public static void main(String[] args) {
	String[] a;
	Scanner s = new Scanner(System.in);
	if (s.hasNextLine()) 
	    a = s.nextLine().split("\\s+");
	else 
	    return;
	 sort(a);
	 assert isSorted(a);
	 show(a);
    }
}
