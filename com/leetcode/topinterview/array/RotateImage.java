package leetcode.topinterview.array;

import java.util.Arrays;

/**
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * <p>
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 * <p>
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 * <p>
 * Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 * <p>
 * Input: matrix = [[1,2],[3,4]]
 * Output: [[3,1],[4,2]]
 */
public class RotateImage {
    public static void main(String[] args) {
//        int[][] arr = {{1, 2}, {3, 4}};
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Image.
    //Memory Usage: 39.5 MB, less than 34.74% of Java online submissions for Rotate Image.
    public static void rotate(int[][] matrix) {
        transpose(matrix);
        revert(matrix);
    }

    public static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int tmpVal = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmpVal;
            }
        }
    }

    public static void revert(int[][] matrix) {
        int lastColumn = matrix.length - 1;
        for (int initialColumn = 0; initialColumn < lastColumn; initialColumn++) {
            for (int i = 0; i < matrix.length; i++) {
                int tmpVal = matrix[i][initialColumn];
                matrix[i][initialColumn] = matrix[i][lastColumn];
                matrix[i][lastColumn] = tmpVal;
            }
            lastColumn--;
        }
    }
}
