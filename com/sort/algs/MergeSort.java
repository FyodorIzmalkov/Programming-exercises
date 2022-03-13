package sort.algs;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MergeSort {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 100) {
            int[] arr = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = ThreadLocalRandom.current().nextInt(100);
            }

            System.out.println("Array before being sorted: ");
            System.out.println(Arrays.toString(arr));

            mergeSort(arr);

            System.out.println("Array after sorting: ");
            System.out.println(Arrays.toString(arr));

            validateTheArray(arr);
            counter++;
        }
    }

    private static void validateTheArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length) {
                System.out.printf("Comparing: %s and %s%n", arr[i], arr[i + 1]);
                if ((arr[i] > arr[i + 1])) {
                    throw new RuntimeException("Error here");
                }
            }
        }
    }

    /**
     * Divide and conquer. Divide the array recursively until it has one element
     * then start to merge and sort them, until you merge all splitted array parts
     *
     * When we merge arrays we compare first elements of the merging arrays and see which is smaller.
     * Take the one that is smaller and add it to the merged array.
     *
     * @param arr array to sort
     */
    private static void mergeSort(int[] arr) {
        int len = arr.length;

        if (len < 2) {
            return;
        }

        int midIndex = len / 2;
        int[] leftPart = new int[midIndex];
        int[] rightPart = new int[len - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftPart[i] = arr[i];
        }
        for (int i = midIndex; i < len; i++) {
            rightPart[i - midIndex] = arr[i];
        }

        mergeSort(leftPart);
        mergeSort(rightPart);

        // MERGE
        merge(arr, leftPart, rightPart);
    }

    private static void merge(int[] arr, int[] leftPart, int[] rightPart) {
        int leftLen = leftPart.length;
        int rightLen = rightPart.length;

        int resultIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < leftLen && rightIndex < rightLen) {
            if (leftPart[leftIndex] <= rightPart[rightIndex]) {
                arr[resultIndex] = leftPart[leftIndex];
                leftIndex++;
            } else { // then right part is smaller
                arr[resultIndex] = rightPart[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }

        //if there are some leftovers (and they should be)
        while(leftIndex < leftLen) {
            arr[resultIndex] = leftPart[leftIndex];
            leftIndex++;
            resultIndex++;
        }

        while(rightIndex < rightLen) {
            arr[resultIndex] = rightPart[rightIndex];
            rightIndex++;
            resultIndex++;
        }
    }
}
