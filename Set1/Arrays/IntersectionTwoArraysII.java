package Arrays;
import java.util.*;
/**
 * 350. Intersection of Two Arrays II
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * **/
public class IntersectionTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map= new HashMap<>();
        List<Integer>integers= new LinkedList<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                integers.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int []answer= new int[integers.size()];
        for(int i=0;i<integers.size();i++){
            answer[i]=integers.get(i);
        }
        return answer;
    }
}
