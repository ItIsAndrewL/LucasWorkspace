package AJ10.Project2_Anything_Array;

class Main {
    public static void main(String[] args) {
        Node[] arr = new Node[5];
        arr[0] = new Node<Integer>(2);
        arr[1] = new Node<String>("A");
        arr[2] = new Node<Double>(2.0);
        arr[3] = new Node<Boolean>(false);
        arr[4] = new Node<Float>(3.0F);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
