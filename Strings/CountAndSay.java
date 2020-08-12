package Strings;

public class CountAndSay {
    public String countAndSay(int n) {

        return recursive(new String("1"),n-1);
    }
    private String recursive(String s, int n){
        StringBuilder builder= new StringBuilder();
        char ch= s.charAt(0);
        int count=0;
        for(int i=1;i<s.length();i++){
            if(ch==s.charAt(i))
                count++;
            else {
                builder.append(String.valueOf(count) + String.valueOf(ch));
                count = 1;
                ch = s.charAt(i);
            }
        }
        builder.append(String.valueOf(count) + String.valueOf((ch)));
        return  recursive(builder.toString(),n-1);
    }
}
