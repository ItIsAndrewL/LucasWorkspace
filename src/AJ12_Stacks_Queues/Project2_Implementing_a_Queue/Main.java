package AJ12_Stacks_Queues.Project2_Implementing_a_Queue;

class Main {
    public static void main(String[] args) {
        Queue line = new Queue(20);
        System.out.println(line.isEmpty());
        System.out.println(line.isFull());
        for(int i=1;i<21;i++) {
            line.enqueue(i);
        }
        System.out.println(line.isEmpty());
        System.out.println(line.isFull());
        for(int i=1;i<6;i++) {
            line.dequeue();
        }
        System.out.println(line);
    }
}