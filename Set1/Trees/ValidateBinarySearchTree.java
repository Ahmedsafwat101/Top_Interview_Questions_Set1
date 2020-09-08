package Trees;

import java.util.ArrayList;
import java.util.LinkedList;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {

        if(root==null) return true;

        ArrayList<Integer>inorder= new ArrayList<>();

        inorderTraversal(root,inorder);

        for(int i=1;i<inorder.size();i++){
            if(inorder.get(i)<inorder.get(i-1))
                return false;
        }
        return true;
    }
    private void inorderTraversal(TreeNode root,ArrayList<Integer>inorder){
        if(root==null) return;
        inorderTraversal(root.left,inorder);
        if(inorder.get(inorder.size()-1)>root.val)
        inorder.add(root.val);
        inorderTraversal(root.right,inorder);

    }
}
