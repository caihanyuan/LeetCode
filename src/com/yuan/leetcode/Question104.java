package com.yuan.leetcode;

/**
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class Question104 {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        else
            return getTreeNodeDepth(root);
    }

    public int getTreeNodeDepth(TreeNode node) {
        if (node.left == null && node.right == null) {
            return 1;
        } else if (node.left != null && node.right != null) {
            return 1 + Math.max(getTreeNodeDepth(node.left), getTreeNodeDepth(node.right));
        } else {
            TreeNode childNode = node.left == null ? node.right : node.left;
            return 1 + getTreeNodeDepth(childNode);
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     *
     */
    public int bestSolution(TreeNode root) {
        if (root == null)
            return 0;
        int left = 0, right = 0;
        left = maxDepth(root.left);
        right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
