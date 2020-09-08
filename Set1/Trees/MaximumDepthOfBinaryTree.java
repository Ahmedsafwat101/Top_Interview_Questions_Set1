package Trees;

import java.util.LinkedList;
import java.util.TreeMap;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        LinkedList<TreeNode> stack= new LinkedList<>();
        LinkedList<Integer> depth = new LinkedList<>();
        if(root==null) return 0;
        stack.add(root);
        depth.add(1);
        int answer=0;
        while (stack.size()>0){
            TreeNode currentRoot = stack.pollLast();
            int currentDepth = depth.pollLast();
            if(currentRoot!=null){
              answer= Math.max(currentDepth,answer);
                stack.add(currentRoot.left);
                stack.add(currentRoot.right);

                depth.add(currentDepth+1);
                depth.add(currentDepth+1);
            }
        }
        return answer;
    }


}
