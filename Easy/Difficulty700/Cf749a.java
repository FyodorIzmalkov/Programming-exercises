package Difficulty700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cf749a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder str = new StringBuilder("");
        int counter = 0;
        while(n >= 4){
            ++counter;
            n -= 2;
            str.append("2 ");
        }
        if (n == 3){
            System.out.println(counter+1);
            str.append("3");
            System.out.println(str);
        }
        else{
            System.out.println(counter+1);
            str.append("2");
            System.out.println(str);
        }
    }
}
