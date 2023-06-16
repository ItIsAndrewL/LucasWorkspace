package AJ11_Linked_Lists.Project1_Singly_Linked_List;

public class Main {
    public static void main(String[] args) {
        Node<Integer> tester = new Node<>(1, null);
        LinkedList<Integer> test = new LinkedList<Integer>(tester);
        test.removeFront();
        System.out.println(test.isEmpty());
        test.insertFront(3);
        test.insertBack(4);
        test.insertFront(2);
        test.insertBack(5);
        System.out.println(test);
        test.removeBack();
        System.out.println(test);
        System.out.println(test.get(5));
        test.clearAll();
        System.out.println(test);
    }
}
