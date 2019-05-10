package tree;

public class SecondHighestPlayer {

    static class Node{
        public Node left;
        public Node right;
        public int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
    }
}
