// priority queue with comparator

import java.util.PriorityQueue;

public class PQTest {
    
    public static void main(String[] args) {
	RevComparator gt = new RevComparator();
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>(1, gt);
	pq.offer(new Integer(6));
	pq.add(new Integer(1));
	pq.add(new Integer(3));
	pq.add(new Integer(10));
	pq.add(new Integer(7));
	pq.add(new Integer(9));
	pq.add(new Integer(2));
	
	System.out.println("The elements in the priority queue are: ");
	for (int i = 0; i < pq.size(); i++) {
	    System.out.print(pq.poll() + " ");
	}
	System.out.println();

    }
}
