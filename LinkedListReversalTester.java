import java.util.Scanner;
import java.io.File;

public class LinkedListReversalTester {
    public static void main(String[] args) {
	Scanner sc = null;
	LinkedListNode<Integer> head = null;
	LinkedListNode<Integer> next = null;
	try {
	     sc = new Scanner(new File(args[0]));
	     
	     while (sc.hasNextInt()) {
		 head = new LinkedListNode<Integer>(sc.nextInt(), next);
		 next = head;
	     }
	}
	catch (Exception e) {
	    System.out.println("Couldnot open file for reading...");
	}
	
	// this line executes even if there is an exception
	System.out.println("Bye...");
	
	// print all elements in the linked list starting at 'head'
	LinkedListNode<Integer> tHead = head;
	while (tHead != null) {
	    System.out.println(tHead.getValue());
	    tHead = tHead.getNext();
	}

	LinkedListReversal<Integer> rev = new LinkedListReversal<Integer>();

	// reverse the list 
	head = rev.reverseList(head);
	// print the reversed list
	System.out.println("Reversed List...");
	while (head != null) {
	    System.out.println(head.getValue());
	    head = head.getNext();
	}
	    
    }
}
