package Design;

import java.util.Random;

public class ShuffleArray {
    int []cloneArray;
    int []actualArray;
    public ShuffleArray(int[] nums) {
          this.cloneArray=  nums.clone();
          this.actualArray=nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
         return this.actualArray;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random random= new Random();
        for(int i=0;i<cloneArray.length;i++){
            int randomIndex= random.nextInt(i+1);
            int temp= cloneArray[randomIndex];
            cloneArray[randomIndex]=cloneArray[i];
            cloneArray[i]=temp;
        }
        return cloneArray;
    }

}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */