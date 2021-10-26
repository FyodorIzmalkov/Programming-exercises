package leetcode.topinterview.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * <p>
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 * <p>
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 *
 * [['.','.','.','.','5','.','.','1','.'],
 * ['.','4','.','3','.','.','.','.','.'],
 * ['.','.','.','.','.','3','.','.','1'],
 * ['8','.','.','.','.','.','.','2','.'],
 * ['.','.','2','.','7','.','.','.','.'],
 * ['.','1','5','.','.','.','.','.','.'],
 * ['.','.','.','.','.','2','.','.','.'],
 * ['.','2','.','9','.','.','.','.','.'],
 * ['.','.','4','.','.','.','.','.','.']]
 */
public class ValidSudoku {
    public static void main(String[] args) {
        char[][] sudoku = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        
        char[][] sudoku2 =   {{'.','.','.','.','5','.','.','1','.'},
  {'.','4','.','3','.','.','.','.','.'},
  {'.','.','.','.','.','3','.','.','1'},
  {'8','.','.','.','.','.','.','2','.'},
  {'.','.','2','.','7','.','.','.','.'},
  {'.','1','5','.','.','.','.','.','.'},
  {'.','.','.','.','.','2','.','.','.'},
  {'.','2','.','9','.','.','.','.','.'},
  {'.','.','4','.','.','.','.','.','.'}};
        System.out.println(isValidSudoku(sudoku2));

    }

    //Runtime: 4 ms
    //Memory Usage: 39.2 MB
    public static boolean isValidSudoku(char[][] board) {
        int[][] intBoard = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char curChar = board[i][j];
                if (curChar == '.') {
                    intBoard[i][j] = 0;
                } else {
                    intBoard[i][j] = Integer.parseInt(String.valueOf(curChar));
                }
            }
        }
        Map<Integer, Integer> rowDuplicates = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Integer curVal = intBoard[i][j];
                if (!rowDuplicates.containsKey(curVal)) {
                    rowDuplicates.put(curVal, 1);
                } else {
                    if (curVal > 0) {
                        return false;
                    }
                }
            }
            rowDuplicates.clear();
        }

        Map<Integer, Integer> columnDuplicates = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Integer curVal = intBoard[j][i];
                if (!columnDuplicates.containsKey(curVal)) {
                    columnDuplicates.put(curVal, 1);
                } else {
                    if (curVal > 0) {
                        return false;
                    }
                }
            }
            columnDuplicates.clear();
        }

        return checkSquare(0, 3, 0, 3, intBoard);
    }

    public static boolean checkSquare(int fromRow, int toRow, int fromColumn, int toColumn, int[][] intBoard) {
        Map<Integer, Integer> squareDuplicates = new HashMap<>();
        if (toColumn > 9 && toRow < 9) {
            fromRow += 3;
            toRow += 3;
            fromColumn = 0;
            toColumn = 3;
        } else if (toColumn > 9 && toRow == 9){
            return true;
        }
        int fromColumnTmp = fromColumn;
        for (; fromRow < toRow; fromRow++) {
            fromColumn = fromColumnTmp;
            for (; fromColumn < toColumn; fromColumn++) {
                Integer curVal = intBoard[fromRow][fromColumn];
                if (!squareDuplicates.containsKey(curVal)) {
                    squareDuplicates.put(curVal, 1);
                } else {
                    if (curVal > 0) {
                        return false;
                    }
                }
            }
        }
        return checkSquare(fromRow - 3, toRow, fromColumn, toColumn + 3, intBoard);
    }
}
