package Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int p1 = 0, p2 = 0;
        int longestSubstring=0;
        while (p1<s.length() && p2<s.length()){
            if(set.contains(s.charAt(p1))){
                set.remove(s.charAt(p2));
                p2++;
            }
            else {
                set.add(s.charAt(p1));
                p1++;
                longestSubstring= Math.max(longestSubstring,p1-p2);
            }
        }
        return longestSubstring;
    }
}
