package cracking.algs;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(100);
        }

        System.out.println("-----BEFORE-----");
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("-----AFTER-----");
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Go through all elements of the array and compare them backward with all elements.
     * If current element is smaller then shift it by one position to the left, until the end of the array or until
     * it is greater than the previous element
     *
     * @param arr array to be sorted
     */
    private static void insertionSort(int[] arr) {
        if (arr.length == 1){
            return;
        }
        int i = 1;
        while (i < arr.length) {
            int currentValue = arr[i];

            int j = i - 1; //previous number
            while (j >= 0 && arr[j] > currentValue) {
                arr[j + 1] = arr[j]; // shift the bigger number to the right
                j--;
            }
            arr[j + 1] = currentValue;
            i++;
        }

    }
}
