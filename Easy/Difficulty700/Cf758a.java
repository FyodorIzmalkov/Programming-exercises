package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cf758a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n ; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
            max = max > arr[i] ? max : arr[i];
        }
        int sum = 0;
        for (int i : arr){
            sum += i < max ? max - i : 0;
        }
        System.out.println(sum);
    }
}
