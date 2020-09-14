package Arrays;

import java.util.*;

public class GroupAnagrams {
    //O(n*klog(k))
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);
            String word2 = String.valueOf(wordArray);
            if (!map.containsKey(word2)) {
                map.put(word2, new ArrayList<>());
            }
            map.get(word2).add(word);

        }
        return new ArrayList<>(map.values());
    }
    //O(n*k)
    public List<List<String>> groupAnagrams2(String[] strs) {
        HashMap<String,List<String>>map= new HashMap<>();
        for (String word : strs) {
            char[] wordArray = word.toCharArray();
            char[] characters = new char[26];
            for (int i = 0; i < wordArray.length; i++) {
              characters[word.charAt(i)-'a']++;
            }
            StringBuilder builder= new StringBuilder();
            for(int i=0;i<26;i++){
                builder.append("#");
                builder.append(characters[i]);
            }
            String wordString= builder.toString();
            if(!map.containsKey(wordString))
                map.put(wordString,new ArrayList<>());
            map.get(wordString).add(word);
        }
        return new ArrayList(map.values());

    }
}
