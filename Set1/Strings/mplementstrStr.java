package Strings;

public class mplementstrStr {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty())
            return 0;
        if(needle.length() > haystack.length())
            return -1;
        if(needle.length()==haystack.length() && needle.equals(haystack))
            return 0;
        for(int i=0;i<=haystack.length()-needle.length();i++) {
            if(haystack.charAt(i) == needle.charAt(0) && haystack.substring(i, i+needle.length()).equals(needle))
                return i;
        }
        return -1;
    }


}
