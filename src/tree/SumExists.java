package tree;

public class SumExists {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.left.right = new TreeNode(9);

        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(8);

        System.out.println(sumExists(root, 12));
    }

    public static boolean sumExists(TreeNode root, int sum) {
        if (root == null) return false;
        sum = sum - root.data;
        if (sum == 0) {
            return true;
        }
        boolean left = sumExists(root.left, sum );
        boolean right = sumExists(root.right, sum);

        return left || right;
    }
}
