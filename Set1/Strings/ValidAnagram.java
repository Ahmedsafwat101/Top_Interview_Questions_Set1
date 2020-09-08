package Strings;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.equals(t)) return true;
        if(s.length()==0 || t.length()==0  || t.length()!=s.length()) return false;
        HashMap<Character,Integer>map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))) return false;

            else{
                if(map.get((t.charAt(i)))==0) return false;
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }
        }

        for(Integer values: map.values()){
            if(values!=0) return false;
        }
        return true;
    }
}

/**There is another solution sorting all strings  is the key of it but the complexity will be O(N logN)**/