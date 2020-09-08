package Strings;

public class Atoi {
    public int myAtoi(String str) {
        if(str.length()==0 || str==null)return 0;
        if(Character.isLetter(str.charAt(0))) return 0;
        StringBuilder stringBuilder= new StringBuilder();
       /* boolean negative= false;
        if(str.charAt(0)=='-') negative=true;*/
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) != ' ')
                stringBuilder.append(str.charAt(i));
        }
        char sign;

        if(stringBuilder.charAt(0)=='-'||stringBuilder.charAt(0)=='+') sign= str.charAt(0);
        else return 0; // start with letter
        StringBuilder num= new StringBuilder();
        for(int i=1;i<stringBuilder.length();i++){
            if(Character.isDigit(stringBuilder.charAt(i))){
                num.append(stringBuilder.charAt(i));
            }
            else break;
        }
        if(num.length()==0) return 0;
        long valOfNum= Long.parseLong(num.toString());
        if(sign=='-') valOfNum*=-1;
        if(valOfNum>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(valOfNum<Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int)valOfNum;
    }
}
