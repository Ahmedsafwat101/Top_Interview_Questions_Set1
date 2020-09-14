package Arrays;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int firstPointer=Integer.MAX_VALUE;
        int secondPointer=Integer.MAX_VALUE;

        for(int num: nums){
            if(num<=firstPointer)
                firstPointer=num;
            else if(num<=secondPointer)
                secondPointer=num;
            else
                return true;
        }
        return false;

    }
}
