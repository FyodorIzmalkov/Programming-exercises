package LeetCodeEz;

import java.util.Arrays;

public class flipAndInvertImage {

    public static int [][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int first = 0;
            int last = A[i].length - 1;
            while (first <= last - 1){
                int tmp = A[i][first];
                A[i][first] = A[i][last] == 1 ? 0 : 1;
                A[i][last] = tmp == 1 ? 0 : 1;
                first++;
                last--;
            }
            if (first == last)
                A[i][first] = A[i][first] == 1 ? 0 : 1;
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        //int[][] arr = {{1,1,0},{1,0,0},{0,1,1},{1,0,1}};
        int[][] res =  flipAndInvertImage(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println();
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j]+" ");
            }
        }
    }
}
