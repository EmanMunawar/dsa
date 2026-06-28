import java.util.ArrayList;

public class KSmallestElementInABSTBrute {
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
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        int k =1;
        System.out.println("Kth smallest element is :" + kthSmallestElement(root,k));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n)");
        System.out.println("Space Complexity = O(n)");
        System.out.println("===============================");

    }
    public static int kthSmallestElement(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list.get(k - 1);

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
