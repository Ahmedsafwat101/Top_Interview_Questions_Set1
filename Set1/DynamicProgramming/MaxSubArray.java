package DynamicProgramming;

public class MaxSubArray {
    //O(n) O(1)
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < max; i++) {
            nums[i] = Math.max(nums[i], nums[i] + sum);
            sum = nums[i];
            if (sum > max)
                max = sum;
        }
        return max;
    }
    //O(nlogn)  O(logn)
    public static int maxSubArray2(int[] nums) {
        return maxSubArrayHelper(nums, 0, nums.length - 1);
    }

    private static int maxSubArrayHelper(int[] nums, int left, int right) {
      if(left==right) return nums[left]; // just one element left
      int mid= ((right-left)/2)+left;

      return  Math.max(Math.max(maxSubArrayHelper(nums,left,mid),maxSubArrayHelper(nums,mid+1,right)),crossSubArray(nums,left,right,mid));

    }

    private static int  crossSubArray(int[] nums, int left, int right, int mid) {
        if(left==right) return nums[left]; // just one element left
        //left
        int maxLeft= Integer.MAX_VALUE;
        int sum=0;
        for(int i=mid;i>=left;i--){
            sum+=nums[i];
            if(maxLeft<sum)
                maxLeft=sum;
        }
        //right
        int maxRight= Integer.MAX_VALUE;
         sum=0;
        for(int i=mid+1;i<=right;i++){
            sum+=nums[i];
            if(maxRight<sum)
                maxRight=sum;
        }
        return Math.max(maxLeft+maxRight,Math.max(maxLeft,maxRight));
    }

}
