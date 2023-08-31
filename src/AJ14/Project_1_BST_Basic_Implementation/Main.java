package AJ14.Project_1_BST_Basic_Implementation;

public class Main {
    public static void main(String[] args) {
        BST metal = new BST();
        metal.insert(5);
        metal.insert(7);
        metal.insert(6);
        metal.insert(2);
        metal.insert(12);
        metal.insert(1);
        metal.insert(4);
        //14261275
        //52137612
        //12456712
        //System.out.println(metal.postOrder());
        //System.out.println(metal.preOrder());
        //System.out.println(metal.inOrder());
        metal.clear();
        System.out.println(metal.inOrder());
        System.out.println("hello!");
    }
}
