package Others;

public class ReverseBits {
    public int reverseBits(int n) {
     int mask=1;
     StringBuilder builder= new StringBuilder();
     for(int i=0;i<32;i++){
         if((n&mask)!=0)
             builder.append(1);
         else
             builder.append(Integer.toBinaryString( 0));

         n=n>>1;
     }
        System.out.println(builder);
     int  ans= Integer.parseUnsignedInt(builder.toString(),2);
        System.out.println(ans);

        return 5;
    }
}
