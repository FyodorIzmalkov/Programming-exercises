package codeforces.difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cf136A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[n];
        int i = 0;
        while (st.hasMoreTokens()){
            array[i] = Integer.parseInt(st.nextToken());
            i++;
            }
        for (int j = 1; j <= n; j++) {
            for (int k = 0; k < array.length ; k++) {
                if (j == array[k]) {
                    System.out.print(k + 1 + " ");
                    break;
                }
            }
            }
        }
}
