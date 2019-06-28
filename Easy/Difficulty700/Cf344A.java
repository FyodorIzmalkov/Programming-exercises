package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cf344A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int currentNum;
        int previousNum = 0;
        while(n > 0){
            currentNum = Integer.parseInt(br.readLine());
            result += currentNum != previousNum ? 1 : 0;
            previousNum = currentNum;
            --n;
        }
        System.out.println(result);
    }
}
