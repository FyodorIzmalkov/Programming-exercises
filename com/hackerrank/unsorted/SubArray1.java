package hackerrank.unsorted;

import java.util.Scanner;

public class SubArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int i = 0;
        while (i < n){
            arr[i] = scanner.nextInt();
            ++i;
        }

        int result = 0;
        for (int j = 0; j < n; j++) {
            int curr = arr[j];
            if (curr < 0){
                result++;
            }
            for (int k = j + 1; k < n; k++) {
                curr += arr[k];
                if (curr < 0){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
