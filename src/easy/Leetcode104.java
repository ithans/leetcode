package easy;
//给定一个二叉树，找出其最大深度。
//二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
public class Leetcode104 {
    public int maxDepth(TreeNode root) {
        return getMaxLength(root, 0);
    }

    public int getMaxLength(TreeNode root, int num) {
        if (root != null) {
            num++;
        } else {
            return num;
        }
        return Math.max(getMaxLength(root.left, num), getMaxLength(root.right, num));
    }
}
