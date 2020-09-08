package Arrays;
/**
 *  189. Rotate Array
 *  https://leetcode.com/problems/rotate-array/
 * */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        if(nums.length==1)
            return;
        k= k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    private void reverse(int[]nums,int start, int end){
        while (start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

}
