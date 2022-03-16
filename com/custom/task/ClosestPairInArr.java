package custom.task;

import static java.lang.Math.abs;

public class ClosestPairInArr {
    // find a pair of values in an array which sum will give us 'k' value
    public static void main(String[] args) {
        int[] arr = {-10, -8, -3, 0, 1, 2, 3, 5, 6, 7, 10, 20, 50};
        int sum = 7;

        printClosestPair(arr, sum);

        int[] arr2 = {-1, 0, 5, 15};
        int sum2 = 6;
        printClosestPair(arr2, sum2);
    }

    private static void printClosestPair(int[] arr, int sum) {
        int leftPointer = 0;
        int rightPointer = arr.length - 1;

        int closestPair = Integer.MAX_VALUE;
        int firstIndexResult = 0;
        int secondIndexResult = 0;
        while (leftPointer < rightPointer) {
            int currentDiff = abs(arr[leftPointer] + arr[rightPointer] - sum);
            if (currentDiff < closestPair) {
                firstIndexResult = leftPointer;
                secondIndexResult = rightPointer;
                closestPair = currentDiff;
            }

            if (arr[leftPointer] + arr[rightPointer] > sum) {
                rightPointer--;
            } else {
                leftPointer++;
            }
        }
        System.out.printf("For sum: %s best found pair is: %s + %s%n", sum, arr[firstIndexResult], arr[secondIndexResult]);
    }
}
