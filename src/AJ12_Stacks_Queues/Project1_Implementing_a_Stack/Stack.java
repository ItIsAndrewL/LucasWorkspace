package AJ12_Stacks_Queues.Project1_Implementing_a_Stack;

public class Stack<T> {

    private Node<T> top; // Index of the topmost element

    public Stack(){
        top = null;
    }

    /** Returns true if the stack is empty **/
    public boolean isEmpty(){
        return top == null;
    }

    /** Pushes data onto the stack **/
    public void push(T data){
        if(top == null){
            Node<T> temp = new Node<T>(data, null);
            top = temp;
        }
        else{
            Node<T> temp1 = top;
            Node<T> temp2 = new Node<T>(data, temp1);
            top = temp2;
        }
    }

    /** Removes topmost item from the stack & returns its value **/
    public int pop() throws UnderflowException{
        Node<T> temp = top.getNext();

    }

    /** Returns value of topmost item on the stack **/
    public int peek(){
        return -1;
    }

    @Override
    public String toString(){
        return "";
    }
}
