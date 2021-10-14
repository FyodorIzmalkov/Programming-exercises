package leetcode.topinterview.array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] testNums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = removeDuplicates2(testNums);
        System.out.println(k);
        System.out.println(Arrays.toString(testNums)); //[0,1,2,3,4]
    }

    public static int removeDuplicates2(int[] nums) {
        int uniqueNumbers = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]){
                ++uniqueNumbers;
                nums[uniqueNumbers] = nums[i];
            }
        }
        return ++uniqueNumbers;
    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int currentNum = 0;
        int swappedElements = 1;
        int max = nums[len - 1];
        for (int i = 0; i < len; i++) {
            currentNum = nums[i];
            if (currentNum == max) {
                break;
            }
            for (int j = i; j < len; j++) {
                if (nums[j] > currentNum) {
                    nums[i + 1] = nums[j];
                    ++swappedElements;
                    break;
                }
            }

        }
        return swappedElements;
    }
}
