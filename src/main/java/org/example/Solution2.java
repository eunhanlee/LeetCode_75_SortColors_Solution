
package org.example;

public class Solution2 {
    /**
     * Sorts the given array in-place, containing only 0s, 1s, and 2s, using the Dutch National Flag algorithm.
     *
     * @param nums The array to be sorted.
     */
    public void sortColors(int[] nums) {
        int low = 0;  // Pointer for 0
        int mid = 0;  // Pointer for 1
        int high = nums.length - 1;  // Pointer for 2

        while (mid <= high) {
            if (nums[mid] == 0) {
                // If the current element is 0, swap it with the element at the low pointer
                swap(nums, low, mid);
                low++;  // Increment low pointer
                mid++;  // Increment mid pointer since the swapped element is known to be 1
            } else if (nums[mid] == 1) {
                // If the current element is 1, move the mid pointer forward
                mid++;
            } else if (nums[mid] == 2) {
                // If the current element is 2, swap it with the element at the high pointer
                swap(nums, mid, high);
                high--;  // Decrement high pointer
                // Note: We do not increment mid pointer in this case since the swapped element is not known yet
            }
        }
    }

    /**
     * Swaps two elements in the given array.
     *
     * @param nums The array in which elements need to be swapped.
     * @param i The index of the first element to be swapped.
     * @param j The index of the second element to be swapped.
     */
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
