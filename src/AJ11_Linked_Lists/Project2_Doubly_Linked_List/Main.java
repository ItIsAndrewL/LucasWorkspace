package AJ11_Linked_Lists.Project2_Doubly_Linked_List;

import AJ11_Linked_Lists.Project1_Singly_Linked_List.LinkedList;
import AJ11_Linked_Lists.Project1_Singly_Linked_List.Node;

public class Main {
    public static void main(String[] args) {
        AJ11_Linked_Lists.Project1_Singly_Linked_List.Node<Integer> tester = new Node<>(1, null);
        LinkedList<Integer> test = new LinkedList<Integer>(tester);
        test.insertFront(4);
        test.insertBack(3);
        System.out.println(test);
        test.insertFront(5);
        test.insertBack(5);
        test.removeFront();
        test.removeBack();
        System.out.println(test);
        System.out.println(test.get(2));
        System.out.println(test.get(3));
        System.out.println(test.get(-1));
        test.clearAll();
        System.out.println(test);
    }
}
