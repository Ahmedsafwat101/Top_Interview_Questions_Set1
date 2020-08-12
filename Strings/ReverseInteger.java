package Strings;

public class ReverseInteger {
    public int reverse(int x) {
       boolean negative= false;
       if(x<0) {negative=true;x=x*-1;}
       long answer=0;
       int lengthOfNum=(int)Math.log10(x);
       while (x>0){
           answer+=Math.pow(10,lengthOfNum)*(x%10);
           x=x/10;
           lengthOfNum--;
       }

       if(negative)answer*=-1;
       if(answer>Integer.MAX_VALUE || answer<Integer.MIN_VALUE) return -0;
       return (int)answer;

    }
}
