package com.yuan.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 637. Average of Levels in Binary Tree
 *
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
 * <p>
 * Example 1:
 * Input:
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p>
 * Output: [3, 14.5, 11]
 * <p>
 * Explanation:
 * The average value of nodes on level 0 is 3,
 * on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
 * Note:
 * The range of node's value is in the range of 32-bit signed integer.
 */
public class Question637 {
    public static List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Double> resultList = new ArrayList<>();
        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(root);

        while (!nodeList.isEmpty()) {
            double sum = 0;
            int size = nodeList.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = nodeList.get(i);
                sum += node.val;
                if (node.left != null) {
                    nodeList.add(node.left);
                }
                if (node.right != null) {
                    nodeList.add(node.right);
                }
            }
            nodeList = nodeList.subList(size, nodeList.size());
            resultList.add(sum / size);
        }
        return resultList;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //best solution
//    class Solution {
//        public List<Double> averageOfLevels(TreeNode root) {
//            int height = getHeight(root);
//            long[] levelSum = new long[height];
//            int[] count = new int[height];
//            getSum(root, levelSum, count, 0);
//            List<Double> res = new LinkedList<>();
//            for (int i = 0; i < levelSum.length; i++) {
//                res.add(levelSum[i] * 1.0 / count[i]);
//            }
//            return res;
//        }
//
//        private int getHeight(TreeNode root) {
//            if (root == null) return 0;
//            return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
//        }
//
//        private void getSum(TreeNode r, long[] l, int[] c, int i) {
//            if (r == null) return;
//            l[i] += r.val;
//            c[i]++;
//            getSum(r.left, l, c, i + 1);
//            getSum(r.right, l, c, i + 1);
//            return;
//        }
//    }
}
