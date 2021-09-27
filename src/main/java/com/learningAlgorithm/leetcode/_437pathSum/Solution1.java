package com.learningAlgorithm.leetcode._437pathSum;


/**
 * 方法一：深度优先搜索
 * 思路与算法
 *
 * 我们首先想到的解法是穷举所有的可能，我们访问每一个节点 \textit{node}node，检测以 \textit{node}node 为起始节点且向下延深的路径有多少种。我们递归遍历每一个节点的所有可能的路径，然后将这些路径数目加起来即为返回结果。
 *
 * 我们首先定义 \textit{rootSum}(p,\textit{val})rootSum(p,val) 表示以节点 pp 为起点向下且满足路径总和为 valval 的路径数目。我们对二叉树上每个节点 pp 求出 \textit{rootSum}(p,\textit{targetSum})rootSum(p,targetSum)，然后对这些路径数目求和即为返回结果。
 *
 * 我们对节点 pp 求 \textit{rootSum}(p,\textit{targetSum})rootSum(p,targetSum) 时，以当前节点 pp 为目标路径的起点递归向下进行搜索。假设当前的节点 pp 的值为 \textit{val}val，我们对左子树和右子树进行递归搜索，对节点 pp 的左孩子节点 p_{l}p
 * l
 * ​
 *   求出 \textit{rootSum}(p_{l},\textit{targetSum}-\textit{val})rootSum(p
 * l
 * ​
 *  ,targetSum−val)，以及对右孩子节点 p_{r}p
 * r
 * ​
 *   求出 \textit{rootSum}(p_{r},\textit{targetSum}-\textit{val})rootSum(p
 * r
 * ​
 *  ,targetSum−val)。节点 pp 的 \textit{rootSum}(p,\textit{targetSum})rootSum(p,targetSum) 即等于 \textit{rootSum}(p_{l},\textit{targetSum}-\textit{val})rootSum(p
 * l
 * ​
 *  ,targetSum−val) 与 \textit{rootSum}(p_{r},\textit{targetSum}-\textit{val})rootSum(p
 * r
 * ​
 *  ,targetSum−val) 之和，同时我们还需要判断一下当前节点 pp 的值是否刚好等于 \textit{targetSum}targetSum。
 *
 * 我们采用递归遍历二叉树的每个节点 pp，对节点 pp 求 \textit{rootSum}(p,\textit{val})rootSum(p,val)，然后将每个节点所有求的值进行相加求和返回。
 */
class Solution1 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        int ret = rootSum(root, targetSum);
        ret += pathSum(root.left, targetSum);
        ret += pathSum(root.right, targetSum);
        return ret;
    }

    public int rootSum(TreeNode root, int targetSum) {
        int ret = 0;

        if (root == null) {
            return 0;
        }
        int val = root.val;
        if (val == targetSum) {
            ret++;
        }

        ret += rootSum(root.left, targetSum - val);
        ret += rootSum(root.right, targetSum - val);
        return ret;
    }


}