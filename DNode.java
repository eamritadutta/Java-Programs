public class DNode {
    protected String elem;
    protected DNode prev, next;
    
    /**
    * Constructor which creates a node with the given fields
    */
    public DNode(String elem, DNode prev, DNode next) {
        this.elem = elem;
        this.prev = prev;
        this.next = next;
    }
    
    public void setElem(String elem) {
        this.elem = elem;
    }
    public void setPrev(DNode prev) {
        this.prev = prev;
    }
    public void setNext(DNode next) {
        this.next = next;
    }
    
    public String getElem(){
        return this.elem;
    }
    public DNode getPrev(){
        return this.prev;
    }
    public DNode getNext(){
        return this.next;
    }
}
