public class DoubleLinkedList {
    private NodeDouble head;
    private NodeDouble tail;
    private int size;
    
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    // Menambah alat musik di akhir list
    public void addLast(AlatMusik alatMusik) {
        NodeDouble newNode = new NodeDouble(alatMusik);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
    }
    
    // Menambah alat musik di awal list
    public void addFirst(AlatMusik alatMusik) {
        NodeDouble newNode = new NodeDouble(alatMusik);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }
    
    // Menghapus alat musik dari awal
    public AlatMusik removeFirst() {
        if (head == null) return null;
        
        AlatMusik removedData = head.getData();
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
        }
        size--;
        return removedData;
    }
    
    // Menghapus alat musik dari akhir
    public AlatMusik removeLast() {
        if (tail == null) return null;
        
        AlatMusik removedData = tail.getData();
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
        size--;
        return removedData;
    }
    
    // Menampilkan semua alat musik dari depan ke belakang
    public void displayForward(String pemain, String tempat) {
        NodeDouble current = head;
        System.out.println("=== DAFTAR ALAT MUSIK (Double Linked List - Forward) ===");
        int counter = 1;
        while (current != null) {
            System.out.print(counter + ". ");
            current.getData().bunyi(pemain, tempat);
            current = current.getNext();
            counter++;
        }
    }
    
    // Menampilkan semua alat musik dari belakang ke depan
    public void displayBackward(String pemain, String tempat) {
        NodeDouble current = tail;
        System.out.println("=== DAFTAR ALAT MUSIK (Double Linked List - Backward) ===");
        int counter = 1;
        while (current != null) {
            System.out.print(counter + ". ");
            current.getData().bunyi(pemain, tempat);
            current = current.getPrev();
            counter++;
        }
    }
    
    // Mendapatkan ukuran list
    public int getSize() {
        return size;
    }
    
    // Mengecek apakah list kosong
    public boolean isEmpty() {
        return head == null;
    }
    
    // Method untuk mendapatkan head
    public NodeDouble getHead() {
        return head;
    }
    
    // Method untuk mendapatkan tail
    public NodeDouble getTail() {
        return tail;
    }
}