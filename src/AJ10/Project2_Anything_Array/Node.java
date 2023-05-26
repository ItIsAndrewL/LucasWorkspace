package AJ10.Project2_Anything_Array;

public class Node<T> {
    T data;

    public Node(T data) {
        this.data = data;
    }

    public T get(){
        return data;
    }

    public void set(T data){
        this.data = data;
    }
    public  String toString() {
        return data.toString();
    }
}
