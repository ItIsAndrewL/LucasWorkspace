package AJ11_Linked_Lists.Project2_Doubly_Linked_List;

public class DoublyLinkedList<T> implements List<T> {
    private Node<T> head, tail;
    private int length;
    public DoublyLinkedList(Node<T> h, Node<T> t, int l){
        head = h;
        tail = t;
        length = l;
    }
    public DoublyLinkedList(T h, T t){
        Node<T> he = new Node<T>(h, null, null);
        Node<T> ta = new Node<T>(t, null, null);
        he.setNext(ta);
        ta.setPrev(he);
        head = he;
        tail = ta;
        length = 2;
    }
    public DoublyLinkedList(T n){
        Node<T> sing = new Node<T>(n, null, null);
        head = sing;
        tail = sing;
        length = 1;
    }
    @Override
    public int getLength() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        if(length <= 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void insertFront(T t) {
        Node<T> neaw = new Node<T>(t, head, null);
        head.setPrev(neaw);
        head = neaw;
        length += 1;
    }

    @Override
    public void insertBack(T t) {
        Node<T> neaw = new Node<T>(t, null, tail);
        tail.setNext(neaw);
        tail = neaw;
        length += 1;
    }

    @Override
    public void removeFront() {
        Node<T> temp = head.getNext();
        temp.setPrev(null);
        head = temp;
        length -= 1;
    }

    @Override
    public void removeBack() {
        Node<T> temp = tail.getPrev();
        temp.setNext(null);
        tail = temp;
        length -= 1;
    }

    @Override
    public T get(int index) {
        if(index < 0){
            System.out.println("Negative numbers are only theoretical.");
            return null;
        }
        Node<T> temp = head;
        for(int i=0;i<index;i++){
            if(temp.getNext() != null){
                temp = temp.getNext();
            }
            else{
                System.out.println("That is not a valid index.");
                return null;
            }
        }
        return temp.getData();
    }

    @Override
    public void clearAll() {
        head = null;
        tail = null;
    }
    @Override
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

    //TODO: Type all your code here!
    //NOTE: this class wont compile until you override all the methods in the interface
}
