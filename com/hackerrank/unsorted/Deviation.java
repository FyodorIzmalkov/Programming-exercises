package hackerrank.unsorted;

import java.util.Scanner;

public class Deviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        double mean = (double)sum / n;
        double totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += Math.pow(arr[i] - mean, 2);
        }
        System.out.printf("%.1f%n", Math.sqrt(totalSum / n));
    }
}
