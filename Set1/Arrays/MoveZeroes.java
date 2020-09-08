package Arrays;
/**
 * 283. Move Zeroes
 * https://leetcode.com/problems/move-zeroes/
 * **/
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               nums[j]=nums[i];
               j++;
           }
       }
       while (j<nums.length){
            nums[j]=0;
       }
    }
}
/**              i **/
/** 1 2 12 0  12 * */
/**        j **/
