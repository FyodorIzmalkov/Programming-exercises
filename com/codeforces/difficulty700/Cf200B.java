package codeforces.difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cf200B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int summ = 0;
        for (int i = 0; i < n; i++) {
            summ += Integer.parseInt(st.nextToken());
        }
        System.out.println((double) summ / n);
    }
}
