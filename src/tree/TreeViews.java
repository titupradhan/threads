package tree;

import java.util.*;

public class TreeViews {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        TreeNode left = new TreeNode(2);
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        root.left = left;

        TreeNode right = new TreeNode(3);
        right.right = new TreeNode(6);
        right.right.left = new TreeNode(7);
        root.right = right;

        levelWise(root);
        printForLevel(root, 3);

        /*topView(root);
        buttonView(root);
        leftView(root);

        rightView(root);*/
    }

    static void printForLevel(TreeNode root, int level) {
        if (root == null || level < 1) return;

        if (level == 1) {
            System.out.print(root.data + "\t");
        }
        printForLevel(root.left, level - 1);
        printForLevel(root.right, level - 1);


}

    /*
     * same as level wise view just need to print the 1st element of each level
     * Printing 1st element after null
     * */
    static void leftView(TreeNode root) {
        if (root == null) return;
        System.out.println("\n---------------- left view -------------\n");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        System.out.println(root.data);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                if (!queue.isEmpty()) {
                    System.out.println(queue.peek().data);
                    queue.add(null);
                }
            } else {
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

    }

    static void rightView(TreeNode root) {
        if (root == null) return;

        System.out.println("\n----------------- right view -------------\n");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        System.out.println(root.data);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                if (!queue.isEmpty()) {
                    System.out.println(queue.peek().data);
                    queue.add(null);
                }
            } else {
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
            }
        }

    }

    static void levelWise(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                if (!queue.isEmpty()) { //no more nodes to add
                    queue.add(null);
                    System.out.println();
                }
            } else {
                System.out.print(node.data + " \t");
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }

            }
        }
        System.out.println("\n-------------------------------------------\n");
    }

    static void buttonViewHelper(TreeNode root, int column, Map<Integer, TreeNode> map) {
        if (root == null) return;

        map.put(column, root);
        buttonViewHelper(root.left, column - 1, map);
        buttonViewHelper(root.right, column + 1, map);

    }

    static void buttonView(TreeNode root) {

        Map<Integer, TreeNode> map = new TreeMap<>();
        buttonViewHelper(root, 0, map);
        System.out.println("\n----------------------buttom view------------------\n");
        map.values().forEach(v -> System.out.print(v.data + "\t"));

    }

    static void topViewHelper(TreeNode root, int column, Map<Integer, TreeNode> map) {
        if (root == null) return;

        map.putIfAbsent(column, root);
        topViewHelper(root.left, column - 1, map);
        topViewHelper(root.right, column + 1, map);

    }

    static void topView(TreeNode root) {
        Map<Integer, TreeNode> treeMap = new TreeMap<>();
        topViewHelper(root, 0, treeMap);
        System.out.println("\n--------------- top view ------------\n");
        treeMap.values().forEach(v -> System.out.print(v.data + "\t"));
    }

}
