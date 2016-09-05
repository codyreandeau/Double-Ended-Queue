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
    //Check if head is null, if so, create head
    if(isEmpty()) {
      head = new Node(data);
      tail = head;
    }else{
    //if head is not null, add to the end of the list
      tail.setNext(new Node(data, null, tail));
      tail = tail.getNext();
    }
  }
 
 /**
   * Method to add element to the back of the list
   */
   public void removeRear(){
     if(isEmpty()) {
       System.out.println("Cannot remove! list is Empty!");
       return;
     }
     Node tmp = tail.getPrev();
     tmp.setNext(null);
     tail = tmp;
    }
   
 /**
   * Method to add element to the back of the list
   */
   public void removeFront(){
    if(isEmpty()) {
       System.out.println("Cannot remove! list is Empty!");
       return;
     }
     Node tmp = head.getNext();
     tmp.setPrev(null);
     head = tmp;
   }
 /**
   * Method to print out all items in the list
   */
  public void print() {
    Node temp = head;
    //print out nodes until we reach null
    while(temp!= null)
    {
      System.out.println(temp.getData() + " ");
      temp = temp.getNext();
    }
  }
    
 /**
   * Method to see if head is empty
   */
  public boolean isEmpty() {
    return head == null;
  }

}

