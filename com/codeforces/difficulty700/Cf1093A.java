package codeforces.difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cf1093A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int currentNum;
        for (int i = 0; i < n; i++) {
            currentNum = Integer.parseInt(br.readLine());
            System.out.println((currentNum >> 1));
        }
    }
}
