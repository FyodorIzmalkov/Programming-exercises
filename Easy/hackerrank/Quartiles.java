package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Quartiles {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int q2 = 0;
        int len = arr.length;
        int mid = len / 2;
        if (len % 2 == 1) {
            q2 = arr[mid];
        } else {
            q2 = (arr[mid] + arr[mid - 1]) / 2;
        }
        int q1;
        if (mid % 2 == 1){
            q1 = arr[mid / 2];
        } else {
            int lowerUpperBound = mid - 1;
            int firstMiddle = arr[lowerUpperBound / 2];
            int secondMiddle = arr[(lowerUpperBound / 2) + 1];
            q1 = (firstMiddle + secondMiddle) / 2;
        }

        int q3;
        if (mid % 2 == 1){
            q3 = arr[(mid + len) / 2];
        } else {
            int firstMiddle = arr[(len - 1 + mid) / 2];
            int secondMiddle = arr[((len - 1 + mid) / 2) + 1];
            q3 = (firstMiddle + secondMiddle) / 2;
        }
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);

    }
}
