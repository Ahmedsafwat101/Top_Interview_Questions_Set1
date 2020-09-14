package Arrays;

import java.util.*;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        Set<Integer> row_set = new HashSet<>();
        Set<Integer> col_set = new HashSet<>();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[R][C] == 0) {
                    row_set.add(i);
                    col_set.add(j);
                }
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(row_set.contains(i)||col_set.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
