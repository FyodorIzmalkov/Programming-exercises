package codeforces.difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CF1095A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder("");
        String str = br.readLine();
        int sum = 0;
        for (int i = 1; sum < str.length(); i++) {
            result.append(str.charAt(sum));
            sum += i;
        }
        System.out.println(result);
    }
}
