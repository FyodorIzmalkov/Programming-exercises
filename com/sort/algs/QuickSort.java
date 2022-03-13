package sort.algs;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int counter = 0;
        while (counter < 100000) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = ThreadLocalRandom.current().nextInt(100);
            }

            System.out.println("Array before being sorted: ");
            System.out.println(Arrays.toString(arr));

            quickSort(arr);

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
     * Pick a pivot, sort the values that are smaller than the pivot to the left of it
     * and the ones that are larger than the pivot to the right of it. Do the same thing
     * recursively with left and right parts. To sort the parts use left and right pointers
     * if leftPointer is on value that is less than a pivot, move a rightPointer untill it would be
     * one the value that is bigger than the pivot, than swap the values. If leftPointer and rightPointer
     * are in the same place - swap the pivot with this number.
     * Pivot choosing strategy is an important thing. You can choose random element, then swap it with the last element
     *
     * @param arr        array of elements to sort
     * @param lowerIndex lower index from which we want to sort
     * @param upperIndex upper index to which we want to sort
     */
    private static void quickSort(int[] arr, int lowerIndex, int upperIndex) {

        if (lowerIndex >= upperIndex) { //base case, one element
            return;
        }

        int pivotIndex = ThreadLocalRandom.current().nextInt(upperIndex - lowerIndex) + lowerIndex;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, upperIndex); // swapping randomly picked element to the end of the partition

        int leftPointer = partition(arr, lowerIndex, upperIndex, pivot);

        quickSort(arr, lowerIndex, leftPointer - 1); //sort the left part recursively
        quickSort(arr, leftPointer + 1, upperIndex); // sort the right part recursively
    }

    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    private static int partition(int[] arr, int lowerIndex, int upperIndex, int pivot) {
        int leftPointer = lowerIndex;
        int rightPointer = upperIndex;
        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer); // swap the elements that are bigger or lower than the pivot
        }

        swap(arr, leftPointer, upperIndex); // swap the pivot point, so we have bigger numbers to the right of it and smaller to the left

        return leftPointer;
    }
}
