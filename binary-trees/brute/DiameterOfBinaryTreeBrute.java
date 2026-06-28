public class DiameterOfBinaryTreeBrute {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(9);
        System.out.println("Diameter is:" + diameterOfBinaryTree(root));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n)");
        System.out.println("Space Complexity = O(n)");
        System.out.println("===============================");

    }
    public static int diameterOfBinaryTree(TreeNode root) {
        int diameter = 0;
        calculateDiameter(root);
        return diameter;

    }

    public static void calculateDiameter(TreeNode root) {
        int diameter = 0;
        if (root == null) {
            return;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        diameter = Math.max(diameter, leftHeight + rightHeight);
        calculateDiameter(root.left);
        calculateDiameter(root.right);

    }
    public static int height(TreeNode root) {
        if (root == null) {
            return 0;

        }
        return Math.max(height(root.left), height(root.right)) + 1;

    }
}