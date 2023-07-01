package org.example;

public class Solution3 {
    /**
     * Sorts the given array using the Quick Sort algorithm.
     *
     * @param nums The array to be sorted.
     */
    public void sortColors(int[] nums) {
        quickSort(nums);
    }

    private static void quickSort(int[] input) {
        quickSortRecur(input, 0, input.length - 1);
    }

    /**
     * Recursively implements Quick Sort using the Lomuto partition scheme.
     * pivot : most right value
     *
     * @param input The array to be sorted.
     * @param left  The starting index of the subarray to be partitioned.
     * @param right The ending index of the subarray to be partitioned.
     */
    private static void quickSortRecur(int[] input, int left, int right) {
        // Quick Sort termination condition: the length of the subarray is 1 or less
        if (left >= right) {
            return;
        }

        // Find the partition position and arrange the elements smaller than the pivot on the left and larger on the right
        int pivotPos = partition(input, left, right);

        // Recursively sort the left partition
        quickSortRecur(input, left, pivotPos - 1);
        // Recursively sort the right partition
        quickSortRecur(input, pivotPos + 1, right);
    }

    /**
     * Swaps two elements in the array.
     *
     * @param input The array.
     * @param a     The index of the first element.
     * @param b     The index of the second element.
     */
    private static void swap(int[] input, int a, int b) {
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }

    /**
     * Uses the Lomuto partition scheme to partition the array and returns the position of the pivot.
     *
     * @param input The array.
     * @param left  The starting index of the subarray to be partitioned.
     * @param right The ending index of the subarray to be partitioned.
     * @return The position of the pivot.
     */
    private static int partition(int[] input, int left, int right) {
        int pivot = input[right];
        int i = (left - 1);

        for (int j = left; j < right; ++j) {
            if (input[j] < pivot) {
                ++i;
                swap(input, i, j);
            }
        }

        swap(input, (i + 1), right);
        return i + 1;
    }
}
