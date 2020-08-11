package Arrays;
/**
 *  136. Single Number
 *  https://leetcode.com/problems/single-number/
**/
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int num=0;
        for(int i=0;i<nums.length;i++){
            num^=nums[i];
        }
        return num;
    }
}
