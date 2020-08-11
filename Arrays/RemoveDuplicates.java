package Arrays;
/**
 * 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int  Unique=1;

        for(int i=1;i<nums.length;i++){
          if(nums[i-1]!=nums[i])
              Unique++;
        }
        return Unique;
    }
}
/**
 * int profit =1
 * arr[0] 7
 * arr[1] 1
 * srr[2]**/