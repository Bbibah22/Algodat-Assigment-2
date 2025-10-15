public class Main {
    public static void main(String[] args) {
        // Membuat objek alat musik
        Gitar g = new Gitar("Gitar Elektrik");
        Drum d = new Drum("Drum Acoustic");
        Piano p = new Piano("Piano");
        
        PemainMusik pemain = new PemainMusik();
        
        // Demo Single Linked List
        System.out.println("IMPLEMENTASI SINGLE LINKED LIST");
        System.out.println("================================\n");
        
        SingleLinkedList singleList = new SingleLinkedList();
        
        // Menambah alat musik ke Single Linked List
        singleList.addFirst(g);
        singleList.addLast(d);
        singleList.addLast(p);
        // Menampilkan semua alat musik
        singleList.displayAll("Musisi", "Studio");
        
        
        // Menghapus alat musik
        singleList.remove("Gitar Elektrik");
        System.out.println("\nSetelah menghapus Gitar Elektrik:");
        singleList.displayAll("Musisi", "Studio");
        
        // Demo Double Linked List
        System.out.println("\n\nIMPLEMENTASI DOUBLE LINKED LIST");
        System.out.println("================================\n");
        
        DoubleLinkedList doubleList = new DoubleLinkedList();
        
        // Menambah alat musik ke Double Linked List
        doubleList.addFirst(g);
        doubleList.addLast(d);
        doubleList.addLast(p);
        
        // Menampilkan dari depan ke belakang
        doubleList.displayForward("Musisi Profesional", "Konser Besar");
        System.out.println();
        // Menampilkan dari belakang ke depan
        doubleList.displayBackward("Musisi Profesional", "Konser Besar");

    }
}