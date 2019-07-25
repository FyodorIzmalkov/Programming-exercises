package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cf1064A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int max;
        int sum = 0;
        int first = Integer.parseInt(stk.nextToken());
        max = first;
        sum += first;
        int second = Integer.parseInt(stk.nextToken());
        max = max > second ? max : second;
        sum += second;
        int third = Integer.parseInt(stk.nextToken());
        max = max > third ? max : third;
        sum += third;
        sum -= max;
        if (sum <= max)
            System.out.println(max - sum + 1);
        else
            System.out.println(0);
    }
}
