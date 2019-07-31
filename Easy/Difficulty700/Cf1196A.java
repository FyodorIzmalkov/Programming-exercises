package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cf1196A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long sum;
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            sum = 0;
            String[] tmp = br.readLine().split(" ");
            sum += Long.parseLong(tmp[0]);
            sum += Long.parseLong(tmp[1]);
            sum += Long.parseLong(tmp[2]);
            sum = sum >> 1;
            result.append(sum + "\n");
        }
        System.out.println(result);
    }
}
