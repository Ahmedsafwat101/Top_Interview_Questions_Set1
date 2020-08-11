package Arrays;
/**
 * 48. Rotate Image
 * https://leetcode.com/problems/rotate-image/
 * **/
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n= matrix.length;
          /**Transpose Vertically**/
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
         /**Reverse**/
        for(int i=0;i<n;i++){
            for(int j=i;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }

    }
}
