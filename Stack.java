// stack implement using linked list
// variable capacity

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
    private Node first;
    private int N;
    
    private class Node {
	T item;
	Node next;
    }

    public boolean isEmpty() {
	return first == null;
    }

    public int size() {
	return N;
    }
    
    public void push (T item) {
	Node oldFirst = first;
	first = new Node();
	first.item = item;
	first.next = oldFirst;
	N++;
    }

    public T pop() {
	T item = first.item;
	first = first.next;
	N--;
	return item;
    }

    // implementing abstract method of Iterable<T>
    public  Iterator<T> iterator() {
	return new StackIterator();
    }
    
    // implements Iterator<T> makes sure we match the 
    // return type of iterator()
    private class StackIterator implements Iterator<T> {
	private Node current = first;
	
	public boolean hasNext() {
	    return current != null;
	}
	
	public T next() {
	    T item = current.item;
	    current = current.next;
	    return item;
	}

	public void remove() {
	}
    }
}
