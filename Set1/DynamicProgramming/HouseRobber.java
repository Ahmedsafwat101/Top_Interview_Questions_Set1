package DynamicProgramming;

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        int sum=0;
        for(int i=1;i< nums.length;i++){
            dp[i]= Math.max(dp[i-2]+nums[i],dp[i-1]);
            sum=Math.max(dp[i],sum);
        }
        return sum;
    }
}
