package hackerrank.unsorted;

import java.util.Arrays;
import java.util.Scanner;

public class Interquartile {

    private static double getQuartile(int arr[], int lower, int upper){
        int len = upper - lower + 1;
        if (len % 2 == 1){
            return (double) arr[lower + len / 2];
        } else {
            return ((double) arr[lower + len / 2 - 1]+ arr[lower + len / 2]) / 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int numArr[] = new int[num];
        for (int i = 0; i < num; i++) {
            numArr[i] = scanner.nextInt();
        }

        int freqArr[] = new int[num];
        for (int i = 0; i < num; i++) {
            freqArr[i] = scanner.nextInt();
        }

        int arrSize = Arrays.stream(freqArr).sum();
        int populatedArr[] = new int[arrSize];

        int counter = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < freqArr[i]; j++) {
                populatedArr[counter] = numArr[i];
                counter++;
            }
        }
        Arrays.sort(populatedArr);
        num = populatedArr.length;
        double q1 = getQuartile(populatedArr, 0, num / 2 - 1);
        double q3;
        if (num % 2 == 0){
            q3 = getQuartile(populatedArr, num / 2, num - 1);
        } else {
            q3 = getQuartile(populatedArr, num / 2 + 1, num - 1);
        }
        System.out.printf("%.1f%n", q3 - q1);

    }
}
