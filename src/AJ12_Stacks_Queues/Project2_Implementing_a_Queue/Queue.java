package AJ12_Stacks_Queues.Project2_Implementing_a_Queue;

public class Queue{
    private final int MAX;	// maximum capacity of the queue
    private int queue[]; // array to store queue elements
    private int front; // the start of the queue
    private int back;	// where to insert the next item in the back
    private int size;		// current size of the queue

    // Constructor to initialize queue
    public Queue(int m){
        this.MAX = m;
        this.queue = new int[MAX];
        this.front = 0;
        this.back = 1;
        this.size = 0;
    }

    // Returns whether the queue is empty or not
    public Boolean isEmpty(){
        return size == 0;
    }

    // Returns whether the queue is full or not
    public Boolean isFull(){
        return size == MAX;
    }

    // Remove front element from the queue
    public int dequeue(){
        if(isEmpty()){
            throw new UnderflowException();
        }
        int temp = queue[front];
        front++;
        front%=MAX;
        size--;
        return temp;
    }

    // Add an item to the back of the queue
    public void enqueue(int item){
        if(isFull()){
            throw new OverflowException();
        }
        else {
            queue[back] = item;
            back++;
            back %= MAX;
            size++;
        }
    }

    // Returns the front element in the queue
    public int front(){
        return queue[front];
    }

    // Returns the size of the queue
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        int remain = MAX - size;
        return "The queue currently has " + size + " items inside of it. It is currently " + remain + " items away from being full.";
    }
}
