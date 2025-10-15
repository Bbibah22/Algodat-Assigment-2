class NodeSingle {
    AlatMusik data;
    NodeSingle next;
    
    public NodeSingle(AlatMusik data) {
        this.data = data;
        this.next = null;
    }
    
    public AlatMusik getData() {
        return data;
    }
    
    public NodeSingle getNext() {
        return next;
    }
    
    public void setNext(NodeSingle next) {
        this.next = next;
    }
}