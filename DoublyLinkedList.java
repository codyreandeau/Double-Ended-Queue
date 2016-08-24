public class DoublyLinkedList {
  
  private Node head;
  private Node tail;
  
     
 /**
   * Method to add element to the front of the list
   */
    public void addFront(String data){
     //Create new node and make it as the head of the list
     head = new Node(data, head, null);
     //If tail is equal to null, that means the list is empty
     if(tail == null) {
       tail = head;
     }
    }
    
 /**
   * Method to add element to the back of the list
   */
   public void addRear(String data){
     //Create new node and make it as the head of the list
     tail = new Node(data, null, tail);
     //If head is equal to null, that means the list is empty
     if(head == null) {
       head = tail;
     }
     }
    }