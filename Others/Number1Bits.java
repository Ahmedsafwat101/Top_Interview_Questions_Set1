package Others;

public class Number1Bits {
    public int hammingWeight(int n) {
        int mask = 1;
        int weight = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0)
                weight++;
            n=n>>1;
        }
        return weight;
    }
}
