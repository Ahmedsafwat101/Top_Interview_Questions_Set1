package Arrays;
import java.util.HashSet;
/**
 * 36. Valid Sudoku
 * https://leetcode.com/problems/valid-sudoku/
 * **/
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0;i<9;i++){
            HashSet<Character>row= new HashSet<>();
            HashSet<Character>col= new HashSet<>();
            HashSet<Character>sub= new HashSet<>();
            for(int j=0;j<9;j++){
              if(board[i][j]!='.' && !row.add(board[i][j])) return false;
              if(board[j][i]!='.' && !col.add(board[j][i])) return false;
              int RowIndex = 3*(i/3);
              int ColIndex = 3*(i%3);
              if(board[RowIndex+j/3][ColIndex+j%3]!='.' && !sub.add(board[RowIndex+j/3][ColIndex+j%3])) return false;            }
        }
        return true;
    }
}
