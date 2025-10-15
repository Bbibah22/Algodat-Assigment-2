public class SingleLinkedList {
    private NodeSingle head;
    private int size;
    
    public SingleLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    // Menambah alat musik di akhir list
    public void addLast(AlatMusik alatMusik) {
        NodeSingle newNode = new NodeSingle(alatMusik);
        if (head == null) {
            head = newNode;
        } else {
            NodeSingle current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }
    
    // Menambah alat musik di awal list
    public void addFirst(AlatMusik alatMusik) {
        NodeSingle newNode = new NodeSingle(alatMusik);
        newNode.setNext(head);
        head = newNode;
        size++;
    }
    
    // Menghapus alat musik berdasarkan nama
    public boolean remove(String nama) {
        if (head == null) return false;
        
        if (head.getData().getNama().equals(nama)) {
            head = head.getNext();
            size--;
            return true;
        }
        
        NodeSingle current = head;
        while (current.getNext() != null && 
               !current.getNext().getData().getNama().equals(nama)) {
            current = current.getNext();
        }
        
        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
            size--;
            return true;
        }
        
        return false;
    }
    
    // Mencari alat musik berdasarkan nama
    public AlatMusik find(String nama) {
        NodeSingle current = head;
        while (current != null) {
            if (current.getData().getNama().equals(nama)) {
                return current.getData();
            }
            current = current.getNext();
        }
        return null;
    }
    
    // Menampilkan semua alat musik
    public void displayAll(String pemain, String tempat) {
        NodeSingle current = head;
        System.out.println("=== DAFTAR ALAT MUSIK (Single Linked List) ===");
        int counter = 1;
        while (current != null) {
            System.out.print(counter + ". ");
            current.getData().bunyi(pemain, tempat);
            current = current.getNext();
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
    public NodeSingle getHead() {
        return head;
    }
}