import java.util.LinkedList;
import java.util.Queue;
public class InvertBinaryTreeBrute {
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
            System.out.println("Preorder Before Invert:");
            preorder(root);
            invertTree(root);
            System.out.println();
            System.out.println("Preorder After Invert:");
            preorder(root);
            System.out.println();
            System.out.println();
            System.out.println("=== Time & Space Complexity ===");
            System.out.println("Time Complexity = O(n)");
            System.out.println("Space Complexity = O(n)");
            System.out.println("===============================");

        }

        // Function to invert tree using BFS
        public static TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;

            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                TreeNode current = queue.poll();
                TreeNode temp = current.left;
                current.left = current.right;
                current.right = temp;
                if (current.left != null) {
                    queue.offer(current.left);

                }
                if (current.right != null) {
                    queue.offer(current.right);

                }

            }
            return root;

        }

        public static void preorder(TreeNode root) {
            if (root == null) {
                return;
            }

            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);

        }

    }



