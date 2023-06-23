package AJ12_Stacks_Queues.Project1_Implementing_a_Stack;

class Main {
    public static void main(String[] args) {
        Stack stock = new Stack();
        System.out.println(stock.isEmpty());
        stock.push(1);
        System.out.println(stock.isEmpty());
        stock.push(2);
        stock.push(3);
        System.out.println(stock.peek());
        stock.pop();
        System.out.println(stock);
    }
}