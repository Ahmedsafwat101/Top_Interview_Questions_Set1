package Trees;

public class ConvertSortedArrayBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTHelper(0,nums.length-1,nums);
    }

    private TreeNode sortedArrayToBSTHelper(int start, int end, int nums[]){
        int mid= start+(end-start)/2;
        TreeNode root= new TreeNode(nums[mid]);
        root.left= sortedArrayToBSTHelper(start,mid-1,nums);
        root.right= sortedArrayToBSTHelper(mid+1,end,nums);
        return root;
    }
}
