package Arrays;
import java.util.*;
/**
 *  217. Contains Duplicate
 *  https://leetcode.com/problems/contains-duplicate/
 *  **/
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(Integer num: nums){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}