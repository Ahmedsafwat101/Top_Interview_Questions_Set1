package Others;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int mask=1;
        int distance=0;
        for(int i=0;i<32;i++){
            if((x&mask)!=(y&mask))
                distance++;
            x=x>>1;
            y=y>>1;
        }
        return distance;

    }
}
