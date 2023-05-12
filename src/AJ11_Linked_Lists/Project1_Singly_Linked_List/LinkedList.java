package AJ11_Linked_Lists.Project1_Singly_Linked_List;

public class LinkedList<T> implements List<T>{
    private Node<T> head;
    private int length;
    public LinkedList(Node<T> head){
        this.head = head;
        length = 1;
    }
    @Override
    public int getLength() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        if(length == 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void insertFront(T t) {
        Node ne = new Node(t, this.head);
        this.head = ne;
    }

    @Override
    public void insertBack(T t) {

    }

    @Override
    public void removeFront() {
        this.head = head.getNext();
    }

    @Override
    public void removeBack() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public boolean clearAll() {
        return false;
    }
    //TODO: type all your code here!
    //NOTE: this class won't compile until you override all the methods in the interface
}
