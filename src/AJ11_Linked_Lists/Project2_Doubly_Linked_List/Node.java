package AJ11_Linked_Lists.Project2_Doubly_Linked_List;

public class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> previous;
    public Node(T d, Node<T> n, Node<T> p){
        data = d;
        next = n;
        previous = p;
    }
    public T getData(){
        return data;
    }
    public Node<T> getNext(){
        return next;
    }
    public Node<T> getPrev(){
        return previous;
    }
    public void setData(T input){
        data = input;
    }
    public void setNext(Node<T> input){
        next = input;
    }
    public void setPrev(Node<T> input){
        previous = input;
    }
}
