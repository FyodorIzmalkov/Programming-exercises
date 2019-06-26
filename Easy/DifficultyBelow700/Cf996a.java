package DifficultyBelow700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cf996a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int counter = 0;
        while (num > 0){
            while (num - 100 >= 0){
                num -= 100;
                counter++;
            }
            while (num - 20 >= 0){
                num -= 20;
                counter++;
            }
            while (num - 10 >= 0){
                num -= 10;
                counter++;
            }
            while (num - 5 >= 0){
                num -= 5;
                counter++;
            }
            while (num > 0){
                num--;
                counter++;
            }
        }
        System.out.println(counter);
    }
}
