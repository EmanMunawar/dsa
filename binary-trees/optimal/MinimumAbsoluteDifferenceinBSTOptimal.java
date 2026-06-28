public class MinimumAbsoluteDifferenceinBSTOptimal {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }

    }
    static Integer previous = null;
    static int minimum = Integer.MAX_VALUE;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println("Minimum Absolute Difference = " + getMinimumDifference(root));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n)");
        System.out.println("Space Complexity = O(h)");
        System.out.println("===============================");

    }
    public static int getMinimumDifference(TreeNode root) {
        previous = null;
        minimum = Integer.MAX_VALUE;
        inorder(root);
        return minimum;

    }
    public static void inorder(TreeNode root) {
        if (root == null) {
            return;

        }
        inorder(root.left);
        if (previous != null) {
            minimum = Math.min(minimum, root.val - previous);

        }
        previous = root.val;
        inorder(root.right);

    }

}