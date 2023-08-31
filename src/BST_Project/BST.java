package BST_Project;

public class BST implements BSTInterface {

    private Node root;
    private int size;
    private class Node {

        int value;
        Node left = null;
        Node right = null;

        public Node(int value) {
            this.value = value;
        }
    }
    @Override
    public int size() {
        return this.size;
    }
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void insert(int value){
        this.root = add(this.root, value);
        size++;
    }
    private Node add(Node node, int value){

        //base case
        if(node == null){
            //add a new node
            return new Node(value);
        }
        if(node.value == value){
            //error: insertion value is already in tree
            throw new IllegalArgumentException(value + "already exists in the tree. No duplicates are allowed.");
        }

        //recursive case
        if(value < node.value){
            node.left = add(node.left, value);
        }else{
            node.right = add(node.right, value);
        }
        return node;
    }

    @Override
    public boolean has(int value) {
        return find(this.root, value) != null;
    }
    private Node find(Node node, int value) {

        //base case
        if(node == null){
            return null;
        }
        if(node.value == value){
            return node;
        }

        //recursive case
        if(value < node.value){
            return find(node.left, value);
        }else{
            return find(node.right, value);
        }

    }
    public String postOrder(){
        return POHelper(this.root);
    }
    private String POHelper(Node node){
        String result = "";
        if(node == null) return result;

        result+=POHelper(node.left);
        result+=POHelper(node.right);
        result+=node.value;
        return result;
    }
    public String preOrder(){
        return PRHelper(this.root);
    }
    private String PRHelper(Node node){
        String result = "";
        if(node == null) return result;

        result+=node.value;
        result+=PRHelper(node.left);
        result+=PRHelper(node.right);
        return result;
    }
    public String inOrder(){
        return INHelper(this.root);
    }
    private String INHelper(Node node){
        String result = "";
        if(node == null) return result;

        result+=INHelper(node.left);
        result+=node.value;
        result+=INHelper(node.right);
        return result;
    }
    public void clear(){
        this.size = 0;
        clearHelper(this.root);
        this.root = null;
    }
    public Node clearHelper(Node node){
        if(node == null) return null;

        node.left = clearHelper(node.left);
        node.right = clearHelper(node.right);
        return null;
    }
}
