//https://leetcode.com/problems/minimum-depth-of-binary-tree

package Tree;

public class MinimumDepthofBinaryTree {

    // Definition for a binary tree node
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        // If one child is null, we must go through the other
        if (root.left == null) return 1 + minDepth(root.right);
        if (root.right == null) return 1 + minDepth(root.left);

        // If both children exist, take the minimum depth
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

    // Optional: main method for testing
    public static void main(String[] args) {
        MinimumDepthofBinaryTree sol = new MinimumDepthofBinaryTree();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(sol.minDepth(root)); // Output: 2
    }
}
