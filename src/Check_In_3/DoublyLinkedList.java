package Check_In_3;

import java.lang.IndexOutOfBoundsException;

public class DoublyLinkedList<T>{

  private Node<T> head;
  private Node<T> tail;
  private int length;

  private class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> prev;
    public Node(T data){
      this.data = data;
      this.next = null;
      this.prev = null;
    }
    public T getData() {
      return this.data;
    }
    public Node<T> getNext() {
      return this.next;
    }
    public Node<T> getPrevious() {
      return this.prev;
    }
    public void setNext(Node<T> next) {
      this.next = next;
    }
    public void setPrevious(Node<T> previous) {
      this.prev = previous;
    }
  }

  public DoublyLinkedList() {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  // TODO: Create remove() method here

  public int getLength() {
    return this.length;
  }

  public boolean isEmpty() {
    return this.length == 0;
  }

  private void doublyLink(Node<T> first, Node<T> second){
    first.setNext(second);
    second.setPrevious(first);
  }

  public void insertFront(T data){

    //create a new node
    Node<T> newNode = new Node<T>(data);

    //insert the new node
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      Node<T> oldFront = this.head;
      head = newNode;
      doublyLink(newNode, oldFront);
    }

    this.length++;
  }

  public void insertBack(T data) {

    //create a new node
    Node<T> newNode = new Node<T>(data);

    //insert the new node
    if (tail == null) {
      head = newNode;
    } else {
      Node<T> oldBack = tail;
      if (oldBack == null) {
        throw new IllegalStateException();
      }
      doublyLink(oldBack, newNode);
    }
    tail = newNode;

    this.length++;

  }

  public void removeFront() {
    Node<T> oldFront = this.head;
    if(oldFront != tail){

      Node<T> newFront = oldFront.getNext();
      newFront.setPrevious(null);
      head = newFront;

      this.length--;
    }
  }

  public void removeBack(){

    Node<T> oldBack = this.tail;
    if(oldBack != head){

      Node<T> newBack = oldBack.getPrevious();
      newBack.setNext(null);

      tail = newBack;

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
    if (this.head == tail) {
      return true;
    }
    //recursive case
    this.removeBack();
    return this.clearAll();
  }

  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("[");
    for (Node<T> n = this.head; n != tail; n = n.getNext()) {
      s.append(n.getData());
      if (n.getNext() != tail) {
        s.append(", ");
      }
    }
    s.append("]");
    return s.toString();
  }
  public boolean remove(T data){
    Node<T> newNode = head;
    for(int i=0;i<length-1;i++){
      if(newNode == head && newNode.getData() == data){
        newNode.getPrevious().setNext(newNode.next);
        return true;
      }
      else if(newNode == tail && newNode.getData() == data){
        newNode.getNext().setPrevious(newNode.prev);
        return true;
      }
      else if(newNode.getData() == data){
        newNode.getNext().setPrevious(newNode.prev);
        newNode.getPrevious().setNext(newNode.next);
        return true;
      }
      newNode = newNode.getNext();
    }
    return false;
  }
}
