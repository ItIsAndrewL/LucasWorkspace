package AJ11_Linked_Lists.Project1_Singly_Linked_List;

public class Node<T> {
    private T data;
    private Node<T> pointer;
    public Node(T d, Node<T> p){
        data = d;
        pointer = p;
    }
    public T getData(){
        return data;
    }
    public Node<T> getNext(){
        return pointer;
    }
    public void setData(T input){
        data = input;
    }
    public void setPointer(Node<T> input){
        pointer = input;
    }
}
