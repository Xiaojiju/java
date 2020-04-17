package com.sladar.leetcode.recursion;
/**
 * @description
 * 110. 平衡二叉树
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 *
 * 示例 1:
 *
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 *
 * 示例 2:
 *
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * 返回 false 。
 * @author moyang
 * @email xiaojiju0811@163.com
 * @time 2020/1/3 18:16
 */
public class BalanceTree {

    public boolean isBalanced(TreeNode root) {
        return getTreeDepth(root) != -1;
    }

    private int getTreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftDepth = getTreeDepth(root.left);
        if (leftDepth == -1) {
            return -1;
        }
        
        int rightDepth = getTreeDepth(root.right);
        if (rightDepth == -1) {
            return -1;
        }
        
        if (Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }
        
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}