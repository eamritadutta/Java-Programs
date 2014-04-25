public class DLinkedList {
    
    protected DNode header, trailer;
    protected int size;
    
    public DLinkedList() {
        header = new DNode(null, null, null); 
        trailer = new DNode(null, header, null);
        header.setNext(trailer);
        size = 0;  
    }
    
    public int size() {
        return this.size();
    }
    
    public boolean isEmpty() {
        return (this.size == 0);
    }
    
    public DNode getLast() throws IllegalStateException {
        if (isEmpty())
            throw new IllegalStateException("List is empty");
        return trailer.getPrev();
    }
    
    public DNode getFirst() throws IllegalStateException {
        if (isEmpty())
            throw new IllegalStateException("List is empty");
        return header.getNext();
    }   
    
    public DNode getPrevious(DNode v) throws IllegalArgummentException {
        if (v == header)
            throw new IllegalArgummentException("Cannot move back past the header of the list");
        return v.getPrev();
    }
    
    public DNode getNext(DNode v) throws IllegalArgummentException {
        if (v == trailer)
            throw new IllegalArgummentException("Cannot move forward past the trailer of the list");
        return v.getNext();
    }
    
    public
}
