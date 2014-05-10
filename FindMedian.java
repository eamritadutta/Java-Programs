import java.util.PriorityQueue;

public class FindMedian {
    private PriorityQueue<Integer> minPQ;
    private PriorityQueue<Integer> maxPQ;

    public FindMedian() {
	minPQ = new PriorityQueue<Integer>();
	maxPQ = new PriorityQueue<Integer>(1, new RevComparator());
    }

    public void insert(int n) {
	// even - add to maxPQ
	if (((maxPQ.size() + minPQ.size()) & 1) == 0) {
	    int min = n;
	    if ((minPQ.size() > 0) && (n > minPQ.peek())) {
		minPQ.offer(n);
		min = minPQ.poll();
	    }
	    maxPQ.offer(min);
	}
	// odd - add to minPQ
	else {
	    int max = n;
	    if ((maxPQ.size() > 0) && (n < maxPQ.peek())) {
		maxPQ.offer(n);
		max = maxPQ.poll();
	    }
	    minPQ.offer(max);   
	}
    }

    public int getMedian() {
	int median = -1;
	if (maxPQ.size() == 0 && minPQ.size() == 0)
	    return median;
	// even
	if (((maxPQ.size() + minPQ.size()) & 1) ==  0) {
	    median = (maxPQ.peek() + minPQ.peek()) >> 1;
	}
	// odd
	else {
	    median = maxPQ.peek();
	}
	return median;
    }
}
