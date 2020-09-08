package Strings;
import java.util.HashMap;


public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
      if(strs.length==0) return "";
       String longestPrefix= strs[0];
       for(int i=1;i<strs.length;i++){
           System.out.println();
         while (strs[i].indexOf(longestPrefix)!=0) {
             longestPrefix = longestPrefix.substring(0, longestPrefix.length() - 1);
         }
       }
     return longestPrefix;
    }
}

