package DifficultyBelow700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cf1154A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int[] intArr = new int[4];
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            intArr[i] = Integer.parseInt(arr[i]);
            max = max < intArr[i] ? intArr[i] : max;
        }
        for (int i : intArr){
            int tmp = max - i;
            if (tmp > 0) {
                System.out.print(tmp + " ");
            }
        }
    }
}
