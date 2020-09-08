package Arrays;
/**
 * 66. Plus One
 * https://leetcode.com/problems/plus-one/
 * **/
public class PlusOne {
    public int[] plusOne(int[] digits) {
       int length= digits.length-1;
       int i=0;
       int zeros=0;
       while (length>=0){

           if(digits[i]+1>9){
               digits[i]=0;
               zeros++;
           }
           else {
               digits[i] = digits[i] + 1;
               break;
           }
           length--;

       }
       if(zeros== digits.length){
           int[]ans= new int[digits.length+1];
           ans[0]=1;
           return ans;
       }
       return digits;
    }
}

