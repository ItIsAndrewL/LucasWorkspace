package Check_In_3;

public class LinkedList<T> {
  private Node<T> head;
  private int length;

  private class Node<T> {
    // TODO: Complete Node Inner Class
    public Node(T data) {

    }
    public T getData() {
      return null; // Note: Replace these `return null` statements
    }
    public Node<T> getNext() {
      return null;
    }
    public void setNext(Node<T> next) {

    }

  }

  // TODO: WRITE INDEX OF METHOD HERE

  public LinkedList() {
    this.head = null;
    this.length = 0;
  }
  public int getLength() {
    return this.length;
  }

  public boolean isEmpty() {
    return this.length == 0;
  }

  public void insertFront(T data){

    //create a new node
    Node<T> newNode = new Node<T>(data);

    //insert the new node
    if (head == null) {
      this.head = newNode;
    } else {
      Node<T> oldFront = this.head.getNext();
      this.head.setNext(newNode);
      newNode.setNext(oldFront);
    }

    this.length++;
  }

  public void insertBack(T data) {

    //create a new node
    Node<T> newNode = new Node<T>(data);

    if (head == null) {
      head = newNode;
    } else {
      // Traverse the list to find the last node
      Node<T> current = this.head;
      while (current.getNext() != null) {
        current = current.getNext();
      }

      //insert the new node
      current.setNext(newNode);
    }
    this.length++;
  }

  public void removeFront() {
    Node<T> oldFront = this.head;
    if(oldFront != null){
      Node<T> newFront = oldFront.getNext();
      this.head = newFront;
      this.length--;
    }
  }

  public void removeBack(){

    //find the last node...
    //and the node previous to the last node (second to last)
    Node<T> previous = null;
    Node<T> current = this.head;
    while(current.getNext() != null){
      previous = current;
      current = current.getNext();
    }

    //if the second to last node isn't null...
    //make the second to last node point to null...
    //to delete the last node
    if(previous != null){
      previous.setNext(null);
      this.length--;
    }
  }

  public T get(int index){
    Node<T> current = this.head;

    while(index > 0){
      //throw an exception if you've reached the end of the list
      if(current == null){
        throw new IndexOutOfBoundsException();
      }
      //decrement the index as you traverse the list
      current = current.getNext();
      index--;
    }
    //once you've traversed "index" number of Nodes
    //return the data in that Node
    if (current == null) {
      throw new IndexOutOfBoundsException();
    }
    return current.getData();
  }

  public boolean clearAll() {
    //base case
    if (this.head == null) {
      return true;
    }
    //recursive case
    this.removeBack();
    return this.clearAll();
  }

  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("[");
    for (Node<T> n = this.head; n != null; n = n.getNext()) {
      s.append(n.getData());
      if (n.getNext() != null) {
        s.append(", ");
      }
    }
    s.append("]");
    return s.toString();
  }
}
