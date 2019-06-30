package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cf509a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; ++i) {
            arr[0][i] = arr[i][0] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        System.out.println(arr[n-1][n-1]);
    }
}
