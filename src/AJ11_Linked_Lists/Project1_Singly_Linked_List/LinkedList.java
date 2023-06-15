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
        length = length + 1;
    }

    @Override
    public void insertBack(T t) {
        Node finl = this.head;
        for(int i=1;i<length;i++){
            finl = finl.getNext();
        }
        Node ne = new Node(t, null);
        finl.setPointer(ne);
        length = length + 1;
    }

    @Override
    public void removeFront() {
        this.head = head.getNext();
        length = length - 1;
    }

    @Override
    public void removeBack() {
        Node finl = this.head;
        for(int i=1;i<length-1;i++){
            finl = finl.getNext();
        }
        finl.setPointer(null);
        length = length - 1;
    }

    @Override
    public T get(int index) {
        Node<T> finl = this.head;
        if(index < 0){
            System.out.println("Negative numbers are only theoretical.");
            return null;
        }
        for (int i = 0; i < index; i++) {
            if(finl.getNext() != null){
                finl = finl.getNext();
            }
            else{
                System.out.println("That is not a valid index.");
                return null;
            }
        }
        return finl.getData();
    }

    @Override
    public void clearAll() {
        this.head = null;
    }
    //TODO: type all your code here!
    //NOTE: this class won't compile until you override all the methods in the interface
    @Override
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

// try {
//            for (int i = 0; i < index; i++) {
//                finl = finl.getNext();
//            }
//        } catch(IndexOutOfBoundsException e){
//            throw new IndexOutOfBoundsException("That is not a valid index.");
//        }
