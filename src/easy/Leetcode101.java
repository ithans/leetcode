package easy;
//给定一个二叉树，检查它是否是镜像对称的。
public class Leetcode101 {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode treeNode1, TreeNode treeNode2) {
        if (treeNode1 == null && treeNode2 == null) {
            return true;
        }
        if (treeNode1 == null || treeNode2 == null) {
            return false;
        }
        return treeNode1.val == treeNode2.val && isMirror(treeNode1.left, treeNode2.right) && isMirror(treeNode1.right, treeNode2.left);
    }
}
