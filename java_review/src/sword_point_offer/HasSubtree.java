package sword_point_offer;
//判断一个数是否为另一个数的子树
public class HasSubtree {
    public boolean HasSubtree(isSameTree.TreeNode root1, isSameTree.TreeNode root2) {
        //大树找和子树相同的的头节点
        if(root1 == null || root2 == null) {
            return false;
        }
        // 有可能有两个和子树的值相等的节点相同   此处不能直接 判断一个就返回false；
        if(root1.val == root2.val) {
            if(isContainTree(root1,root2)) {
                return true;
            }
        }
        return HasSubtree(root1.left,root2)|| HasSubtree( root1.right,root2);
    }
    public boolean isContainTree(isSameTree.TreeNode root1, isSameTree.TreeNode root2) {
        //子树完代表全部匹配
        if(root2 == null) {
            return true;
        }
        //父树完代表不匹配
        if(root1 == null) {
            return false;
        }
        return isContainTree( root1.left,root2.left)
                && isContainTree( root1.right,root2.right) && (root2.val == root1.val);
    }
}
