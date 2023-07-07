package AJ13_Priority_Queues_Maps.Project1_Class_Rank;

import java.util.PriorityQueue;

public class Main {
    public static void main(String args[]){
        PriorityQueue<Student> pQueue = new PriorityQueue<>(15, new StudentComparator());
        pQueue.add(new Student("Andrew", 3.9));
        pQueue.add(new Student("Joshua", 2.1));
        pQueue.add(new Student("Alex", 4.0));

        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.poll());
    }
}
