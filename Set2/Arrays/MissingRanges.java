package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ans = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        if(nums.length==0){
            addRange(lower,upper,ans);
            return ans;
        }

        if(nums[0]>lower){
            addRange(lower,nums[0]-1,ans);
        }

        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]!=1)
                addRange(nums[i]+1,nums[i+1]-1,ans);
        }

        if(nums[nums.length-1]<upper){
            addRange(nums[nums.length-1]+1,upper-1,ans);
        }
        return ans;
    }
    private static void  addRange(int lower, int upper, List<String>ans){
        if(lower==upper)
            ans.add(upper+"");
        else
        {
            ans.add(lower+"->"+upper);
        }
    }
}
