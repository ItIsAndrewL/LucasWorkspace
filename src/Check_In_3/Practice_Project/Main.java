package Check_In_3.Practice_Project;
import AJ13_Priority_Queues_Maps.Project1_Class_Rank.Student;
import AJ13_Priority_Queues_Maps.Project1_Class_Rank.StudentComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        String[] names = {"Kyle", "Johnny", "Carlos", "Brian", "Asia", "Chloe", "Melissa", "Finn", "Brooklyn", "Kesha", "Gavin", "Isabella", "Andre", "Matias", "Ebony", "Devin", "James", "Shawn"};
        queue.addAll(List.of(names));
        // TODO: Call reverse, print out, call alphabetize, print out again
        Stack<String> stack = new Stack<>();
        System.out.println(queue);
        for(int i=0;i<=queue.size()-1;){
            stack.push(queue.poll());
        }
        for(int i=0;i<=stack.getLength()-1;){
            queue.add(stack.pop());
        }
        System.out.println(queue);
        PriorityQueue<String> pQueue = new PriorityQueue<>(20);
        for(int i=0;i<=queue.size()-1;){
            pQueue.add(queue.poll());
        }
        for(int i=0;i<=pQueue.size()-1;){
            queue.add(pQueue.poll());
        }
        System.out.println(queue);
    }

    private static void reverse(Queue<String> queue){
        // TODO
    }
    private static void alphabetize(Queue<String> queue){
        // TODO
    }
}
