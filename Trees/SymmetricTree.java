package Trees;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
            return inorder(root,root);
    }
    private boolean inorder(TreeNode node1, TreeNode node2){
        if(node1==null && node2==null) return true;
        if(node1==null || node2==null) return false;

     return (inorder(node1.left,node2.right)&&inorder(node1.right,node2.left)&&node1.val==node2.val);

    }
}
