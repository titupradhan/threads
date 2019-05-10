package tree;

import java.util.Stack;

public class BTreeTest<T> {

    static class TreeNode<T> {

        public T data;
        public TreeNode<T> left;
        public TreeNode<T> right;

        public TreeNode(T data) {
            this.data = data;
        }

        public TreeNode() {
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(1);

        TreeNode<Integer> rootLeftTree = new TreeNode<>(2);
        TreeNode<Integer> left = new TreeNode<>(4);
        TreeNode<Integer> right = new TreeNode<>(5);
        root.left = rootLeftTree;
        rootLeftTree.left = left;
        rootLeftTree.right = right;

        TreeNode<Integer> rootRightTree = new TreeNode<>(3);
        root.right = rootRightTree;

        BTreeTest<Integer> test = new BTreeTest<>();
        test.inorder(root);
        System.out.println("**************************");
        //test.iterativeInOrder(root);
        System.out.println(test.height(root));

    }

    private void iterativeInOrder(TreeNode<T> root) {
        if (root == null) return;

        Stack<TreeNode<T>> stack = new Stack<>();
        TreeNode<T> c = root;

        while (c != null || !stack.isEmpty()) {
            while (c != null) {
                stack.push(c);
                c = c.left;
            }

            final TreeNode<T> n = stack.pop();
            System.out.println(n);
            c = n.right;
        }
    }

    private  int height(TreeNode<T> root){
        if(root == null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left,right) + 1;
    }



    private void inorder(TreeNode<T> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root);
        inorder(root.right);
    }
}
