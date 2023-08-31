package Check_In_3.Practice_Project;

import AJ12_Stacks_Queues.Project1_Implementing_a_Stack.Node;
import AJ12_Stacks_Queues.Project1_Implementing_a_Stack.UnderflowException;

public class Stack<T> {

    private AJ12_Stacks_Queues.Project1_Implementing_a_Stack.Node<T> top; // Index of the topmost element

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
            AJ12_Stacks_Queues.Project1_Implementing_a_Stack.Node<T> temp = new AJ12_Stacks_Queues.Project1_Implementing_a_Stack.Node<T>(data, null);
            length++;
            top = temp;
        }
        else{
            AJ12_Stacks_Queues.Project1_Implementing_a_Stack.Node<T> temp1 = top;
            AJ12_Stacks_Queues.Project1_Implementing_a_Stack.Node<T> temp2 = new AJ12_Stacks_Queues.Project1_Implementing_a_Stack.Node<T>(data, temp1);
            length++;
            top = temp2;
        }
    }

    /** Removes topmost item from the stack & returns its value **/
    public T pop() throws UnderflowException {
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
    public int getLength(){
        return this.length;
    }

    @Override
    public String toString(){
        return "The stack currently holds " + length + " items. The topmost item is " + top.getData() + ".";
    }
}
