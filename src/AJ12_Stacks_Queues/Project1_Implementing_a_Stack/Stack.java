package AJ12_Stacks_Queues.Project1_Implementing_a_Stack;

public class Stack<T> {

    private Node<T> top; // Index of the topmost element

    private int length = 0;
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
            length++;
            top = temp;
        }
        else{
            Node<T> temp1 = top;
            Node<T> temp2 = new Node<T>(data, temp1);
            length++;
            top = temp2;
        }
    }

    /** Removes topmost item from the stack & returns its value **/
    public T pop() throws UnderflowException{
        if(this.top == null){
            throw new UnderflowException();
        }
        Node<T> temp = top.getNext();
        T data = top.getData();
        top.setPointer(null);
        top = temp;
        length--;
        return data;
    }

    /** Returns value of topmost item on the stack **/
    public T peek() throws UnderflowException{
        if(this.top == null){
            throw new UnderflowException();
        }
        return top.getData();
    }

    @Override
    public String toString(){
        return "The stack currently holds " + length + " items. The topmost item is " + top.getData() + ".";
    }
}
