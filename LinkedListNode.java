public class LinkedListNode<T> {
    private T val;
    private LinkedListNode<T> next;

    // constructor 
    // NOTE the constructor for a generic class does not have T in it !! 
    public LinkedListNode (T value, LinkedListNode<T> next) {
	this.val = value;
	this.next = next;
    }
    
    public T getValue() {
	return this.val;
    }

    public LinkedListNode<T> getNext() {
	return this.next;
    }

    public void setNext(LinkedListNode<T> next) {
	this.next = next;
    }
}
