public class SingleLinkedList extends LinkedListADT {
    private Node head;
    private Node tail;
    
    private class Node {
        String data;
        Node next;
        
        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public SingleLinkedList() {
        head = null;
        tail = null;
    }
    
    @Override
    public void insert(String data) {
        Node newNode = new Node(data);
        if (tail != null) {
            tail.next = newNode;
            tail = newNode;
        } else {
            head = tail = newNode;
        }
    }
    
    @Override
    public boolean search(String data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) return true;
            current = current.next;
        }
        return false;
    }
    
    @Override
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    
    @Override
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addHead(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    
    public String removeHead() {
        if (head == null) return null;
        String data = head.data;
        head = head.next;
        if (head == null) tail = null;
        return data;
    }
}