package Others;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int numSum=0;
        int actualSum=0;
        for(int i=0;i<nums.length;i++){
            numSum+=nums[i];
        }
        for(int i=0;i<=nums.length;i++){
            actualSum+=i;
        }
        return actualSum-numSum;
    }
}
