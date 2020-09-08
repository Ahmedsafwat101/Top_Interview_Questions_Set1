package Strings;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.length()==0|| s==null) return true;

        StringBuilder stringBuilder= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i))){
                stringBuilder.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        int start=0;
        int end=stringBuilder.length()-1;
        while (start<end){
            if(stringBuilder.charAt(start)!=stringBuilder.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

}
