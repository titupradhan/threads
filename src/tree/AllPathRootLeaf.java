package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class AllPathRootLeaf {

    static class Node {

        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {
        Node root = new Node(2);

        root.left = new Node(3);
        root.right = new Node(5);

        root.left.left = new Node(34);
        root.left.left.left = new Node(10);
        root.left.left.right = new Node(7);

        root.left.right = new Node(6);


        root.right.left = new Node(12);
        root.right.right = new Node(13);
/*                    2
                    /   \
                   3     5
                /  \    /  \
               34  6   12  13
            /   \
            10  7

*/

        //printRootToLeafPath(root, new LinkedList<>());

        printInOrder(root);
    }

    static  void printInOrder(Node root) {
        if (null == root) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (stack.peek().left != null) {
            stack.push(stack.peek().left);
        }

        while (!stack.isEmpty()) {
            final Node node = stack.pop();
            System.out.print(node.data + "->");

            if (node.right != null) {
                stack.push(node.right);
            }
        }
    }




    static void print(Node root) {
        if (root == null) {
            return;
        }

        print(root.left);
        System.out.println(root.data);
        print(root.right);
    }

    static void printRootToLeafPath(Node root, LinkedList<Node> nodes) {
        if (root == null) return;
        nodes.add(root);
        if (root.left == null && root.right == null) {
            for (Node n : nodes) {
                System.out.print(n.data + "->");

            }
            System.out.println();
        } else {
            printRootToLeafPath(root.left, nodes);

            printRootToLeafPath(root.right, nodes);
        }

        nodes.removeLast();
    }
}
