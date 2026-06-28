public class KSmallestElementInBSTOptimal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
            }

        }
    static int count;
    static int answer;
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
        int count = 0;
        int answer = 0;
        inorder(root, k);
        return answer;

    }
    public static void inorder(TreeNode root, int k) {
            if (root == null) {
            return;

        }

        inorder(root.left,k);
            count++;
            if(count == k){
                answer = root.val;
                return;
            }
            inorder(root.right,k);
    }
}
