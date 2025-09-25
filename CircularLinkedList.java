public class CircularLinkedList extends LinkedListADT {
    private Node head;
    private Node current;
    
    private class Node {
        String data;
        Node next;
        
        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public CircularLinkedList() {
        head = null;
        current = null;
    }
    
    @Override
    public void insert(String data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            head.next = head;
            current = head;
        } else {
            newNode.next = head.next;
            head.next = newNode;
        }
    }
    
    @Override
    public boolean search(String data) {
        if (head == null) return false;
        
        Node temp = head;
        do {
            if (temp.data.equals(data)) return true;
            temp = temp.next;
        } while (temp != head);
        
        return false;
    }
    
    @Override
    public void display() {
        if (head == null) return;
        
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }
    
    @Override
    public boolean isEmpty() {
        return head == null;
    }
    
    public void displayCycle(int cycles) {
        if (head == null) return;
        
        current = head;
        for (int i = 0; i < cycles; i++) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}