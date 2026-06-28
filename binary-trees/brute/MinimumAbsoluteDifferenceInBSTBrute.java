import java.util.ArrayList;

public class MinimumAbsoluteDifferenceInBSTBrute {
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
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println("Minimum Absolute Difference = " + getMinimumDifference(root));
        System.out.println();System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n^2)");
        System.out.println("Space Complexity = O(n)");
        System.out.println("===============================");

    }

    public static int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                min = Math.min(min, Math.abs(list.get(i) - list.get(j)));

            }

        }
        return min;

    }

    public static void inorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;

        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);

    }

}