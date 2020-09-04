package sword_point_offer;

public class IsBalancedTree {
    public boolean IsBalanced_Solution(reConstructBinaryTree.TreeNode root) {
        if(root == null) {
            return true;
        }
        int left = deep(root.left);
        int right = deep(root.right);
        int result = left > right ? left - right : right - left;
        if( result == 1 || result == 0) {
            return true;
        }
        return false;
    }
    public int deep(reConstructBinaryTree.TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = 1 + deep(root.left);
        int right = 1 + deep(root.right);
        return (left > right ? left : right);
    }
}
