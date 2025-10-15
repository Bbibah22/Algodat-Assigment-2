class NodeDouble {
    AlatMusik data;
    NodeDouble next;
    NodeDouble prev;
    
    public NodeDouble(AlatMusik data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    
    public AlatMusik getData() {
        return data;
    }
    
    public NodeDouble getNext() {
        return next;
    }
    
    public NodeDouble getPrev() {
        return prev;
    }
    
    public void setNext(NodeDouble next) {
        this.next = next;
    }
    
    public void setPrev(NodeDouble prev) {
        this.prev = prev;
    }
}