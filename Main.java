public class Main {
  
  public static void main(String[] args) {
    
    DoublyLinkedList list = new DoublyLinkedList();
    
    list.addFront("Steve");
    list.addFront("Jeff");
    list.addFront("Larry");
    list.addRear("Bob");
    list.addRear("Mary");
    
    list.print();
    
  }
  
}