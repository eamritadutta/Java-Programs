// adding the same elements to a linked list 
// and an array list to see the order

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
 
public class LinkedListAndArrayList {
    public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	al.add(1);
	al.add(2);
	al.add(3);

	System.out.println("Printing the array list: ");
	Iterator<Integer> it = al.iterator();
	while (it.hasNext()) 
	    System.out.print(it.next());

	System.out.println();

	LinkedList<Integer> ll = new LinkedList<Integer>();
	
	ll.add(1);
	ll.add(2);
	ll.add(3);

	System.out.println("Printing the linked list: ");
	it = ll.iterator();
	while (it.hasNext()) 
	    System.out.print(it.next());
	
	System.out.println();

    }
}
