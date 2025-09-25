public class DoublyLinkedList extends LinkedListADT {
    private DblNode head;
    private DblNode tail;
    
    private class DblNode {
        String data;
        DblNode prev;
        DblNode next;
        
        public DblNode(String data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }
    
    @Override
    public void insert(String data) {
        DblNode newNode = new DblNode(data);
        
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    
    @Override
    public boolean search(String data) {
        DblNode current = head;
        while (current != null) {
            if (current.data.equals(data)) return true;
            current = current.next;
        }
        return false;
    }
    
    @Override
    public void display() {
        DblNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    @Override
    public boolean isEmpty() {
        return head == null;
    }
    
    public void displayBackward() {
        DblNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}