public class Main {
    public static void main(String[] args) {
        System.out.print("Singly LinkedList Output: ");
        System.out.println();
        SingleLinkedList singleList = new SingleLinkedList();
        singleList.addHead("Start");
        singleList.insert("A");
        singleList.insert("B");
        singleList.insert("C");
        
        System.out.print("Tail List: ");
        singleList.display();
        System.out.println();
        
        System.out.println("Removed: " + singleList.removeHead());
        
        System.out.print("Tail List: ");
        singleList.display();
        System.out.println();
        System.out.println("---------------------------------------------------------- ");
        
        System.out.print("Doubly LinkedList Output: ");
        System.out.println();
        DoublyLinkedList doubleList = new DoublyLinkedList();
        doubleList.insert("One");
        doubleList.insert("Two");
        doubleList.insert("Three");
        
        System.out.print("Forward: ");
        doubleList.display();
        System.out.println();
        
        System.out.print("Backward: ");
        doubleList.displayBackward();
        System.out.println();
        System.out.println("---------------------------------------------------------- ");

        System.out.print("Circular LinkedList Output: ");
        System.out.println();
        CircularLinkedList circularList = new CircularLinkedList();
        circularList.insert("Red");
        circularList.insert("Green");
        circularList.insert("Blue");
        
        System.out.print("Circular List: ");
        circularList.display();
        System.out.println();
        
        System.out.print("Cycle 8 times: ");
        circularList.displayCycle(8);
        System.out.println();
    }
}