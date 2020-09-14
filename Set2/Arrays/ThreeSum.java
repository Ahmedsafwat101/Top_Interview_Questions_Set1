package Arrays;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
      if(nums.length==0) return new ArrayList<>();
      List<List<Integer>>answer= new ArrayList<>();
      Arrays.sort(nums);
      int target=0; //the problem statement fixed the target to zero
      for(int i=0;i< nums.length-2;i++){
          if(i==0 || nums[i]!=nums[i-1]){
              int left=i+1;
              int right= nums.length-1;
              while (left<right){
                  int sum= nums[i]+nums[left]+nums[right];
                  if(sum==target){
                      answer.add(Arrays.asList(nums[i],nums[left++],nums[right--]));
                      //check if the next left is equals to the left-1 to avoid duplicates
                      while (left<right && nums[left]==nums[left-1])
                          left++;
                  }
                  else if(sum>target)
                      right--;
                  else
                      left++;
              }
          }
      }
      return answer;
    }
}
