package codeforces.difficultyBelow700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cf1146A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int counter = 0;
        for (int i = 0; i < str.length();i++){
            if (str.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.print(counter > str.length() - counter ? str.length() : (counter + counter - 1));
    }
}
