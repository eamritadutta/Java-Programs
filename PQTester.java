// 

import java.util.PriorityQueue;

public class PQTester {
    public static void main(String[] args) {
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

	pq.offer(5);
	pq.offer(4);
	pq.offer(3);
	pq.offer(2);
	pq.offer(1);

	// peek 
	System.out.println("The element at the head of the queue is: " + pq.peek());
    }
}
