public class LinkedListReversal<T> {
    public LinkedListNode<T> reverseList(LinkedListNode<T> head) {
	LinkedListNode<T> prev = null;

	while (head != null) {
	    LinkedListNode<T> next = head.getNext();
	    head.setNext(prev);
	    prev = head;
	    head = next;
	}

	return prev;
    }
}
